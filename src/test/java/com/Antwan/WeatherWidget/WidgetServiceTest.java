package com.Antwan.WeatherWidget;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;


@DataJpaTest
@TestPropertySource(locations = "classpath:test.properties")
public class WidgetServiceTest {
@Autowired
private TestEntityManager entityManager;

    /**
     * this is method is used to access to variable of the model.
     */
    @Test
    void GetWidget() {
    }
}
