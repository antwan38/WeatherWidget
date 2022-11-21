package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Widget;
import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.service.WidgetService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.lang.constant.Constable;
import java.util.Map;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/widget")
public class WidgetController {

    private final WidgetService widgetservice;

    WidgetController(WidgetService widgetservice) {
        this.widgetservice = widgetservice;
    }

    @PostMapping("/")
    public Constable saveGridInfo(@RequestBody Map<String, String> widgetdataMap) {
        WidgetData widgetData = new WidgetData(Integer.parseInt(widgetdataMap.get("column")), Integer.parseInt(widgetdataMap.get("row")), widgetdataMap.get("location"));
        widgetservice.saveWidget(widgetData);
        return "ok";
    }

    @GetMapping("/{location}")
    public Widget findOne(@PathVariable String location) {

        return widgetservice.getWidget(location);
    }

}
