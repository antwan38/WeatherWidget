package com.Antwan.WeatherWidget;

import com.Antwan.WeatherWidget.controller.WidgetController;
import com.Antwan.WeatherWidget.model.Widget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class WidgetControllerTest {

    /**
     * this is variable is the connection to the service.
     */
    @Autowired
    private WidgetController widgetController;




    /**
     * this is method is used to access to variable of the model.
     */
    @Test
    void findOne() {
        // Arrange

        String location = "Limburg";
        String country = "NL";
        Float lat = (float)51.25;
        Float lon = (float)6.0;
        int id = 2751596;


        // Act

        Widget actualWidget = widgetController.findOne(location);


        // Assert
        Assertions.assertEquals(location, actualWidget.getName());
        Assertions.assertEquals(id, actualWidget.getId());
        Assertions.assertEquals(country, actualWidget.getSys().getCountry());
        Assertions.assertEquals(lat, actualWidget.getCoord().getLat());
        Assertions.assertEquals(lon, actualWidget.getCoord().getLon());

    }
}
