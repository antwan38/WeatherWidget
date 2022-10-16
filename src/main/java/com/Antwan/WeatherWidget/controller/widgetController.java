package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Widget;
import com.Antwan.WeatherWidget.service.widgetservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/widget")
public class widgetController {
    widgetservice widgetservice = new widgetservice();
    //@Autowired
    //private widgetservice widgetserviceservice;
    //@CrossOrigin("http://localhost:4200/")
    //@PostMapping("/post")
    //public String add(@RequestBody Widget test){
       // return "Widget "+ widgetserviceservice.AddTest(test).getName()+ " is added";
    //}

    //@CrossOrigin("http://localhost:4200/")
    //@GetMapping("/get")
    //public List<Widget> FindAll(){
       // return widgetserviceservice.FindAll();
    //}

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/get/{location}")
    public Widget FindOne(@PathVariable String location){

        return widgetservice.GetWidget(location);
    }

}
