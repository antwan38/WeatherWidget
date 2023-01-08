package com.Antwan.WeatherWidget.service;


import com.Antwan.WeatherWidget.controller.WebsocketServer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer;

import javax.websocket.server.ServerContainer;
import java.net.URI;

public class JettyServer {
    private final int port;
    private Server server;


    public JettyServer(int port) {
        this.port = port;
    }

    public void start() throws Exception {
        server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(port);
        server.addConnector(connector);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        try {
            ServerContainer wscontainer = WebSocketServerContainerInitializer.configureContext(context);
            wscontainer.addEndpoint(WebsocketServer.class);
            System.out.println("Begin start");
            server.start();


        } catch (Throwable t) {
            t.printStackTrace(System.err);
        }
    }

    public void stop() throws Exception {
        server.stop();
        System.out.println("Jetty server stopped");
    }

    public URI getWebsocketUri(Class<WebsocketServer> class1) {
        return  server.getURI();
    }


}
