package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Client;
import com.Antwan.WeatherWidget.model.WidgetData;
import com.Antwan.WeatherWidget.service.GridService;
import com.Antwan.WeatherWidget.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.lang.constant.Constable;
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
    private final GridService gridService;
    private final ClientService clientService;


    GridController(final GridService gridService, final ClientService clientService) {
        this.clientService = clientService;
        this.gridService = gridService;
    }
    /**
     * @return all the grid data of a user.
     */
    @GetMapping("/")
    public List<WidgetData> getGrid(@RequestParam("id") final long id) {
        return gridService.getGrid(id);
    }
    /**
     * this is method is used to delete a specific widget,
     * out of the grid of a user.
     * @param id of grid widget
     */
    @DeleteMapping("/")
    public void deleteGrid(@RequestBody final Map<String, String> id) {
        gridService.deleteWidget((long) Integer.parseInt(id.get("id")));
    }
    /**
     * this is method is used to get a widget in the grid.
     * @return widgetdata from the id
     * @param id of a widget
     */
    @GetMapping("/info/")
    public Optional<WidgetData> getGridItem(@RequestParam("id") final int id) {
        return gridService.getGridItem(id);
    }
    /**
     * this is method creates a widget in the grid for a user.
     * @return html message
     * @param widgetdataMap is the data to place the widget on the right place
     */
    @PostMapping("/")
    public Constable saveGridInfo(@RequestBody final Map<String, String> widgetdataMap) {
        Client client = clientService.getClient(Long.parseLong(widgetdataMap.get("clientId")));
        WidgetData widgetData = new WidgetData(Integer.parseInt(widgetdataMap.get("column")), Integer.parseInt(widgetdataMap.get("row")), widgetdataMap.get("location"), client);
        gridService.saveWidget(widgetData);
        return "ok";
    }
    /**
     * this is method edits the data of a widget.
     * @return message
     * @param widgetdataMap info of widgetdata
     */
    @PutMapping ("/")
    public Constable editWidget(@RequestBody final Map<String, String> widgetdataMap) {
        Client client = clientService.getClient(Long.parseLong(widgetdataMap.get("clientId")));
        WidgetData widgetData = new WidgetData(Long.parseLong(widgetdataMap.get("id")), Integer.parseInt(widgetdataMap.get("column")), Integer.parseInt(widgetdataMap.get("row")), widgetdataMap.get("location"), client);
        gridService.editWidget(widgetData);
        return "ok";
    }
}
