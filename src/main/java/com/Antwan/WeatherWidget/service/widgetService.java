package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.Widget;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.repository.widgetDal;
import com.Antwan.WeatherWidget.repository.widgetDataRepository;
import com.Antwan.WeatherWidget.repository.widgetRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class widgetService {

    private widgetDal widgetDal;
    private widgetDataRepository widgetRepository;
    widgetService(widgetDal widgetDal, widgetDataRepository widgetRepository){
        this.widgetDal = widgetDal;
        this.widgetRepository = widgetRepository;
    }

    public Widget GetWidget(String location){
        Widget widget = widgetDal.GetWidget(location);
        if (widget != null){
            return  widget;
        }
        return null;
    }

   public void saveWidget(WidgetData widgetData){
        widgetRepository.save(widgetData);
   }

   public List<WidgetData> getGrid(){
      return widgetRepository.findAll();
   }


}
