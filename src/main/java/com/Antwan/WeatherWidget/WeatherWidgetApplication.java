/**
 * Info about this package doing something for package-info.java file.
 */
package com.Antwan.WeatherWidget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherWidgetApplication {
	private WeatherWidgetApplication(){

	}
	public static void main(String[] args) {
		SpringApplication.run(WeatherWidgetApplication.class, args);
	}
}
