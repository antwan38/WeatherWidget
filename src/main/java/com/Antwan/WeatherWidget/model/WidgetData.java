package com.Antwan.WeatherWidget.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class WidgetData {
    /**
     * this variable is the id of the widget.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * this variable is column location of the grid of the widget.
     */
    private int wColumn;
    /**
     * this variable is row location of the grid of the widget.
     */
    private int wRow;
    /**
     * this variable is the real word location of the widget.
     */
    private String location;
    /**
     * this is method is used to access to variable of the model.
     */
    public Long getId() {
        return id;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * this is constructor initializes a widget.
     */
    public WidgetData(final int column, final int row, final String location) {
        this.wColumn = column;
        this.location = location;
        this.wRow = row;
    }


    /**
     * this is method is used to access to variable of the model.
     */
    public int getwColumn() {
        return wColumn;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setwColumn(final int wColumn) {
        this.wColumn = wColumn;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public int getwRow() {
        return wRow;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setwRow(final int wRow) {
        this.wRow = wRow;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public String getLocation() {
        return location;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setLocation(final String location) {
        this.location = location;
    }
}
