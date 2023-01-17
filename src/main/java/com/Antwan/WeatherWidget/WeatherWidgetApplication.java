/**
 * Info about this package doing something for package-info.java file.
 */
package com.Antwan.WeatherWidget;

import com.Antwan.WeatherWidget.service.JettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WeatherWidgetApplication {
   /**
    * this is method is used to start the project.
    * @param args
    */
   public static void main(String[] args) throws Exception {
      SpringApplication.run(WeatherWidgetApplication.class, args);
      JettyServer jettyServer = new JettyServer(8084);
      jettyServer.start();
   }
}
