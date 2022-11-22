package com.Antwan.WeatherWidget.repository;

import com.Antwan.WeatherWidget.model.Widget;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WidgetDal implements WidgetRepository {
    /**
     * this is variable is used to make a model,
     * from the data of the external api.
     */
    private final RestTemplate restTemplate = new RestTemplate();
    /**
     * this is method is used to get the widget data from an external api.
     * @return a widget
     * @param location of a widget
     */
    public Widget getWidget(final String location) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q={location}&appid=23e64b8b085045bf62a90bce0d0341e7";
        try {
            return restTemplate.getForObject(url, Widget.class, location);
        } catch (Exception e) {
            return null;
        }

    }
}
