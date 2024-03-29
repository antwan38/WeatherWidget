package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Widget;
import com.Antwan.WeatherWidget.service.WidgetService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/widget")
public class WidgetController {
    /**
     * this is variable is the connection to the service.
     */
    private final WidgetService widgetservice;

    WidgetController(final WidgetService widgetservice) {
        this.widgetservice = widgetservice;
    }
    /**
     * this is method finds the data of a widget by using an external method.
     * @return widget
     * @param location on the world
     */
    @GetMapping("/")
    public Widget findOne(@RequestParam("location") final String location) {

        return widgetservice.getWidget(location);
    }

}
