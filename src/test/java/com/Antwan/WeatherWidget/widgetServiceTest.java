package com.Antwan.WeatherWidget;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.util.Assert;

@DataJpaTest
@TestPropertySource(locations = "classpath:test.properties")
public class widgetServiceTest {

    @Autowired
    private TestEntityManager em;
    @Test
    void GetWidget(){
    }
}
