package com.Antwan.WeatherWidget;

import com.Antwan.WeatherWidget.controller.GridController;
import com.Antwan.WeatherWidget.model.WidgetData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class GridControllerTest {

    @Autowired
    private GridController gridController;


    /**
     * this is method is used to save a widget in the database.
     */
    @Test
    public void saveGridInfo() throws Exception {
        // Arrange
        WidgetData widgetData = new WidgetData(2,4,"leo");
        assertThat(gridController).isNotNull();
        Map<String,String> mapWidgetdata = new HashMap<>();
        mapWidgetdata.put("column", String.valueOf(widgetData.getwColumn()));
        mapWidgetdata.put("row", String.valueOf(widgetData.getwRow()));
        mapWidgetdata.put("location", widgetData.getLocation());

        // Act
        gridController.saveGridInfo(mapWidgetdata);

        // Assert
        Assertions.assertEquals(1, gridController.getGrid().size());
        Assertions.assertEquals("leo", gridController.getGrid().get(0).getLocation());
        Assertions.assertEquals(4, gridController.getGrid().get(0).getwRow());
        Assertions.assertEquals(2, gridController.getGrid().get(0).getwColumn());
        gridController.
    }

    @Test
    public void deleteGrid() throws Exception {
        // Arrange
        WidgetData widgetData = new WidgetData(2,4,"leo");
        assertThat(gridController).isNotNull();
        Map<String, String> mapWidgetdata = new HashMap<>();
        Map<String, String> mapId = new HashMap<>();
        mapWidgetdata.put("column", String.valueOf(widgetData.getwColumn()));
        mapWidgetdata.put("row", String.valueOf(widgetData.getwRow()));
        mapWidgetdata.put("location", widgetData.getLocation());
        mapId.put("id", "2");

        // Act
        for(int i = 0; i < 2; i++) {
            gridController.saveGridInfo(mapWidgetdata);
        }
        gridController.deleteGrid(mapId);

        // Assert
        Assertions.assertEquals(2, gridController.getGrid().size());
        List<WidgetData> widgetDataList = gridController.getGrid();
        int id = 1;
        for (WidgetData widgetDataFromDataBase: widgetDataList) {
            
            Assertions.assertEquals(id, widgetDataFromDataBase.getId());
            id = 3;
        }

    }
}
