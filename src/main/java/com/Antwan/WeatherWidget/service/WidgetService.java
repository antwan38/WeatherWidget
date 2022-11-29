package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.Widget;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.repository.WidgetDal;
import com.Antwan.WeatherWidget.repository.WidgetDataRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class WidgetService {
    /**
     * this is variable is used to connected to the repository.
     */
    private WidgetDal widgetDal;
    /**
     * this constructor is used to inizialize the widget service.
     * @param widgetDal to connect to the repository
     */
    public WidgetService(final WidgetDal widgetDal) {
        this.widgetDal = widgetDal;
    }


    /**
     * this is method is used to get the widget data from an external api.
     * @return a widget
     * @param location of a widget
     */
    public Widget getWidget(final String location) {
        Widget widget = widgetDal.getWidget(location);
        if (widget != null) {
            return  widget;
        }
        return null;
    }



}
