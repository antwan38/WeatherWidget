package com.Antwan.WeatherWidget;

import com.Antwan.WeatherWidget.controller.GridController;
import com.Antwan.WeatherWidget.model.User;
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
    /**
     * this is variable is the connection to the service.
     */
    @Autowired
    private GridController gridController;
    /**
     * this is method is used to save a widget in the database as a test.
     */
    @Test
    public void saveGridInfo() throws Exception {
        // Arrange
        User user = new User(1, "Antwan", "antwansittard@gmail.com");
        WidgetData widgetData = new WidgetData(2, 4, "leo", user);
        assertThat(gridController).isNotNull();
        Map<String, String> mapWidgetdata = new HashMap<>();
        mapWidgetdata.put("column", String.valueOf(widgetData.getwColumn()));
        mapWidgetdata.put("row", String.valueOf(widgetData.getwRow()));
        mapWidgetdata.put("location", widgetData.getLocation());
        // Act
        gridController.saveGridInfo(mapWidgetdata);

        // Assert
        Assertions.assertEquals(1, gridController.getGrid(1).size());
        Assertions.assertEquals("leo", gridController.getGrid(1).get(0).getLocation());
        Assertions.assertEquals(4, gridController.getGrid(1).get(0).getwRow());
        Assertions.assertEquals(2, gridController.getGrid(1).get(0).getwColumn());
    }
    /**
     * this is method is used to delete a widget from the database as a test.
     */
    @Test
    public void deleteGrid() throws Exception {
        // Arrange
        User user = new User(1, "Antwan", "antwansittard@gmail.com");
        WidgetData widgetData = new WidgetData(2, 4, "leo", user);
        assertThat(gridController).isNotNull();
        Map<String, String> mapWidgetdata = new HashMap<>();
        Map<String, String> mapId = new HashMap<>();
        mapWidgetdata.put("column", String.valueOf(widgetData.getwColumn()));
        mapWidgetdata.put("row", String.valueOf(widgetData.getwRow()));
        mapWidgetdata.put("location", widgetData.getLocation());
        mapId.put("id", "2");

        // Act
        for (int i = 0; i < 2; i++) {
            gridController.saveGridInfo(mapWidgetdata);
        }
        gridController.deleteGrid(mapId);

        // Assert
        Assertions.assertEquals(2, gridController.getGrid(1).size());
        List<WidgetData> widgetDataList = gridController.getGrid(1);
        int id = 1;
        for (WidgetData widgetDataFromDataBase: widgetDataList) {

            Assertions.assertEquals(id, widgetDataFromDataBase.getId());
            id = 3;
        }

    }
    /**
     * this is method edits the data of a widget as a test.
     */
    @Test
    public void editWidget() {
        // Arrange
        WidgetData widgetData = new WidgetData(3, 267, 423, "china");
        assertThat(gridController).isNotNull();
        Map<String, String> mapWidgetdata = new HashMap<>();
        mapWidgetdata.put("column", String.valueOf(widgetData.getwColumn()));
        mapWidgetdata.put("row", String.valueOf(widgetData.getwRow()));
        mapWidgetdata.put("location", widgetData.getLocation());
        mapWidgetdata.put("id", String.valueOf(widgetData.getId()));

        // Act
        // Assert
        Assertions.assertEquals("leo", gridController.getGridItem(3).get().getLocation());
        Assertions.assertEquals(4, gridController.getGridItem(3).get().getwRow());
        Assertions.assertEquals(2, gridController.getGridItem(3).get().getwColumn());
        gridController.editWidget(mapWidgetdata);
        Assertions.assertEquals("china", gridController.getGridItem(3).get().getLocation());
        Assertions.assertEquals(423, gridController.getGridItem(3).get().getwRow());
        Assertions.assertEquals(267, gridController.getGridItem(3).get().getwColumn());

    }
}
