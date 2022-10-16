package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.Widget;

import com.Antwan.WeatherWidget.repository.widgetDal;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

@Service
public class widgetservice {


    widgetDal widgetDal = new widgetDal();
    public Widget GetWidget(String location){
        Widget widget = widgetDal.GetWidget(location);
        if (widget != null){
            return  widget;
        }
        return null;
    }

    //public Widget AddTest(Widget widget){
        //return widgetRepository.save(widget);

    //}

    //public List<Widget> FindAll(){
      //  return widgetRepository.findAll();

    //}


}
