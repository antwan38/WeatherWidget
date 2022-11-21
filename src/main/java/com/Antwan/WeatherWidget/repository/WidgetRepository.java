package com.Antwan.WeatherWidget.repository;


import com.Antwan.WeatherWidget.model.Widget;
import org.springframework.stereotype.Repository;
@Repository
public interface WidgetRepository {
    /**
     * this is method is used to get the widget data from an external api.
     */
    Widget getWidget(String location);
}
