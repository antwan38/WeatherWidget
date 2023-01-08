package com.Antwan.WeatherWidget.service;


import com.Antwan.WeatherWidget.model.Widget;
import com.Antwan.WeatherWidget.repository.WidgetDal;
import com.microsoft.signalr.HubConnection;
import com.microsoft.signalr.HubConnectionBuilder;

import javax.websocket.Session;

public class EventHandler implements Runnable {

    private String location;
    private WidgetDal widgetDal;
    private Widget widget;
    private Session session;
    public EventHandler(final String location, final Session session) {
        this.widgetDal = new WidgetDal();
        this.location = location;
        this.session = session;

    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100000);
                this.widget = widgetDal.getWidget(location);
                this.session.getAsyncRemote().sendText("{ \"location\" : "+"\"" + widget.getName()+ "\"" + ", \"temp\" : " + widget.getMain().getTemp() + " }");
                System.out.println("{ \"location\" : "+"\"" + widget.getName()+ "\"" + ", \"temp\" : " + widget.getMain().getTemp() + " }");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("thread stopped");
    }

}
