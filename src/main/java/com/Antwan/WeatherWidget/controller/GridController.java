package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.service.WidgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/grid")
public class GridController {
    /**
     * this is variable is the connection to the service.
     */
    private final WidgetService widgetservice;

    GridController(final WidgetService widgetservice) {
        this.widgetservice = widgetservice;
    }
    /**
     * @return all the grid data of a user.
     */
    @GetMapping("/")
    public List<WidgetData> getGrid() {
        return widgetservice.getGrid();
    }
    /**
     * this is method is used to delete a specific widget,
     * out of the grid of a user.
     * @param id of grid widget
     */
    @DeleteMapping("/")
    public void deleteGrid(@RequestBody final Map<String, String> id) {
        widgetservice.deleteWidget((long) Integer.parseInt(id.get("id")));
    }
    /**
     * this is method is used to get a widget in the grid.
     * @return widgetdata from the id
     * @param id of a widget
     */
    @GetMapping("/{id}")
    public Optional<WidgetData> getGridItem(@PathVariable final int id) {
        return widgetservice.getGridItem(id);
    }
}
