package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.Widget;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.repository.WidgetDal;
import com.Antwan.WeatherWidget.repository.widgetDataRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WidgetService {

    private WidgetDal widgetDal;
    private widgetDataRepository widgetRepository;

    WidgetService(WidgetDal widgetDal, widgetDataRepository widgetRepository) {
        this.widgetDal = widgetDal;
        this.widgetRepository = widgetRepository;
    }

    public Widget getWidget(String location) {
        Widget widget = widgetDal.getWidget(location);
        if (widget != null) {
            return  widget;
        }
        return null;
    }

   public void saveWidget(WidgetData widgetData) {
        widgetRepository.save(widgetData);
   }

   public List<WidgetData> getGrid() {
      return widgetRepository.findAll();
   }

   public void deleteWidget(Long id) {
        widgetRepository.deleteById(id);
   }


}
