package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Widget;
import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.service.WidgetService;
import org.springframework.web.bind.annotation.*;

import java.lang.constant.Constable;
import java.util.Map;

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
     * this is method creates a widget in the grid for a user.
     * @return html message
     * @param widgetdataMap is the data to place the widget on the right place
     */
    @PostMapping("/")
    public Constable saveGridInfo(@RequestBody final Map<String, String> widgetdataMap) {
        WidgetData widgetData = new WidgetData(Integer.parseInt(widgetdataMap.get("column")), Integer.parseInt(widgetdataMap.get("row")), widgetdataMap.get("location"));
        widgetservice.saveWidget(widgetData);
        return "ok";
    }
    /**
     * this is method finds the data of a widget by using an external method.
     * @return widget
     * @param location on the world
     */
    @GetMapping("/{location}")
    public Widget findOne(@PathVariable final String location) {

        return widgetservice.getWidget(location);
    }
    /**
     * this is method edits the data of a widget.
     * @return message
     * @param widgetdataMap info of widgetdata
     */
    @PutMapping ("/")
    public Constable editWidget(@RequestBody final Map<String, String> widgetdataMap) {
        WidgetData widgetData = new WidgetData(Long.parseLong(widgetdataMap.get("id")), Integer.parseInt(widgetdataMap.get("column")), Integer.parseInt(widgetdataMap.get("row")), widgetdataMap.get("location"));
        widgetservice.editWidget(widgetData);
        return "ok";
    }

}
