package com.Antwan.WeatherWidget;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;


@DataJpaTest
@TestPropertySource(locations = "classpath:test.properties")
public class widgetServiceTest {
@Autowired
private TestEntityManager entityManager;


    @Test
    void GetWidget() {
    }
}
