package com.Antwan.WeatherWidget.repository;

import com.Antwan.WeatherWidget.model.WidgetData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface WidgetDataRepository extends JpaRepository<WidgetData, Long> {
    /**
     * this is method is used to get the grid data of a user to place all the widgets in the right place.
     * @return a list of widgets
     */
    List<WidgetData> findAllByUserId(long id);
}
