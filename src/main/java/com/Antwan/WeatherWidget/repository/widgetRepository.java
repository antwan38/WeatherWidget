package com.Antwan.WeatherWidget.repository;


import com.Antwan.WeatherWidget.model.Widget;
import org.springframework.stereotype.Repository;
@Repository
public interface widgetRepository {
    public Widget GetWidget(String location);
}
