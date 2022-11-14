package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Widget;
import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.repository.widgetDal;
import com.Antwan.WeatherWidget.service.widgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.constant.Constable;
import java.util.Map;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/widget")
public class widgetController {
    private final widgetService widgetservice;
    widgetController(widgetService widgetservice){
        this.widgetservice = widgetservice;
    }
    //@RequestParam("location") String location, @RequestParam("column") int column, @RequestParam("row") int row,
    @PostMapping("/")
    public Constable String ( @RequestBody Map<String,String> widgetdataMap){
        WidgetData widgetData = new WidgetData( Integer.parseInt(widgetdataMap.get("column")), Integer.parseInt(widgetdataMap.get("row")), widgetdataMap.get("location"));
        widgetservice.saveWidget(widgetData);
        return "ok";
    }

    @GetMapping("/{location}")
    public Widget FindOne(@PathVariable String location){

        return widgetservice.GetWidget(location);
    }

}
