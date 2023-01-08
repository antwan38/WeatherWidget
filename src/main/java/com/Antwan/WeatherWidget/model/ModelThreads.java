package com.Antwan.WeatherWidget.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ModelThreads {
    private Set<Thread> threads = Collections.synchronizedSet(new HashSet<>());
    private String sessionID;

    public ModelThreads(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public boolean killAllThreads() {
        for (Thread thread : threads) {
            thread.interrupt();
        }
        for (Thread thread : threads) {
            if (!thread.isInterrupted()) {
                return false;
            }
        }
        return true;
    }

    public void addThread(Thread thread) {
        threads.add(thread);
    }

    public Set<Thread> getThreads() {
        return threads;
    }

    public void setThreads(Set<Thread> threads) {
        this.threads = threads;
    }
}
