package com.Antwan.WeatherWidget.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class WidgetData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int wColumn;
    private int wRow;

    private String location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WidgetData(int column, int row, String location) {
        this.wColumn = column;
        this.location = location;
        this.wRow = row;
    }

    public WidgetData() {

    }

    public int getwColumn() {
        return wColumn;
    }

    public void setwColumn(int wColumn) {
        this.wColumn = wColumn;
    }

    public int getwRow() {
        return wRow;
    }

    public void setwRow(int wRow) {
        this.wRow = wRow;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
