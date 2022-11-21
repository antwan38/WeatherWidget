package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.service.WidgetService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/grid")
public class GridController {
    private final WidgetService widgetservice;

    GridController(final WidgetService widgetservice) {
        this.widgetservice = widgetservice;
    }

    @GetMapping("/")
    public List<WidgetData> getGrid() {
        return widgetservice.getGrid();
    }

    @DeleteMapping("/")
    public void deleteGrid(@RequestBody final Map<String, String> id) {
        System.out.println(id);
        widgetservice.deleteWidget((long) Integer.parseInt(id.get("id")));
    }
}
