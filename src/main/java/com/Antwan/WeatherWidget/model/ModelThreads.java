package com.Antwan.WeatherWidget.model;

import java.util.*;

public class ModelThreads {
    private Set<Thread> threads = Collections.synchronizedSet(new HashSet<>());
    private List<String> locations;
    private String sessionID;

    public ModelThreads(String sessionID) {
        this.sessionID = sessionID;
        this.locations = new ArrayList<>();
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


    public List<String> getLocations() {
        return locations;
    }

    public void addLocations(String location) {
        this.locations.add(location);
    }
}
