package com.Antwan.WeatherWidget.repository;

import com.Antwan.WeatherWidget.model.Widget;
import org.springframework.web.client.RestTemplate;

public class widgetDal implements widgetRepository{

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Widget GetWidget(String location) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q={location}&appid=23e64b8b085045bf62a90bce0d0341e7";
        try {
            return restTemplate.getForObject(url, Widget.class, location);
        }catch (Exception e){

            return null;

        }

    }
}
