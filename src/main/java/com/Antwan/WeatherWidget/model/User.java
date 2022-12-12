package com.Antwan.WeatherWidget.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @JsonIgnoreProperties("widgetData")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<WidgetData> widgetData;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public User() {
    }

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public List<WidgetData> getWidgetData() {
        return widgetData;
    }

    public void setWidgetData(List<WidgetData> widgetData) {
        this.widgetData = widgetData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
