package com.Antwan.WeatherWidget.repository;

import com.Antwan.WeatherWidget.model.User;
import com.Antwan.WeatherWidget.model.WidgetData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
