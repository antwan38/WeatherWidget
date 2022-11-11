package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.service.widgetService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.constant.Constable;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/grid")
public class gridController {
    private final widgetService widgetservice;
    gridController(widgetService widgetservice){
        this.widgetservice = widgetservice;
    }
    @GetMapping("/")
    public List<WidgetData> getGrid(){
        return widgetservice.getGrid();
    }
}
