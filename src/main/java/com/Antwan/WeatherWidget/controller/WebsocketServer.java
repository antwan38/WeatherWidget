package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.ModelThreads;
import com.Antwan.WeatherWidget.service.EventHandler;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint(value = "/websocket")
public class WebsocketServer {
    private static final Set<Session> SESSIONS = Collections.synchronizedSet(new HashSet<>());
    private static final Set<ModelThreads> THREADS = Collections.synchronizedSet(new HashSet<>());


    @OnOpen
    public void onOpen(Session session) {
        SESSIONS.add(session);
        System.out.println("WebSocket connection opened: " + session.getId());
        ModelThreads thread = new ModelThreads(session.getId());
        THREADS.add(thread);
        System.out.println(SESSIONS.size());
    }

    @OnMessage
    public void onMessage(Session session, String message) {
        System.out.println("Received message from client: " + message);
        for (ModelThreads thread1 : THREADS) {
            if (thread1.getSessionID().equals(session.getId())) {
                if (!checkIfThreadAlreadyExist(message, session)) {
                    Thread thread = new Thread(new EventHandler(message, session));
                    thread.start();
                    thread1.addThread(thread);
                    thread1.addLocations(message);
                    System.out.println(session.getId() + "new thread added" + thread1.getThreads().size());
                }
            }
        }
    }


    @OnClose
    public void onClose(Session session) {
        SESSIONS.remove(session);
        System.out.println("WebSocket connection closed: " + session.getId());
        for (ModelThreads thread : THREADS) {
            if (thread.getSessionID().equals(session.getId())) {
                System.out.println(session.getId() + "thread removed" + thread.getThreads().size());
                if (thread.killAllThreads()) {
                    THREADS.remove(thread);
                    System.out.println("thread removed");
                }

            }
        }
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        SESSIONS.remove(session);
        for (ModelThreads thread : THREADS) {
            if (thread.getSessionID().equals(session.getId())) {
                if (thread.killAllThreads()) {
                    THREADS.remove(thread);
                }

            }
        }
        System.out.println("WebSocket error: " + throwable);
    }

    private Boolean checkIfThreadAlreadyExist(String location, Session session) {
        for (ModelThreads thread : THREADS) {
            if (thread.getSessionID().equals(session.getId())) {
                if (thread.getLocations() != null) {
                    for (String location1 : thread.getLocations()) {
                        if (location1.equals(location)) {
                            System.out.println("thread" + location + "already exist");
                            return true;
                        }
                    }
                }

            }
        }
        return false;
    }

}
