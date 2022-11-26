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
     * this constructor initializes the widgetdata.
     */
    public WidgetData() {

    }

    /**
     * this is method is used to access to variable of the model.
     * @return id of widgetdata
     */
    public Long getId() {
        return id;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * this is constructor initializes a widget.
     * @param column
     * @param row
     * @param location
     */
    public WidgetData(final int column, final int row, final String location) {
        this.wColumn = column;
        this.location = location;
        this.wRow = row;
    }
    /**
     * this is constructor initializes a widget.
     * @param column
     * @param row
     * @param location
     * @param id
     */
    public WidgetData(final long id, final int column, final int row, final String location) {
        this.wColumn = column;
        this.location = location;
        this.wRow = row;
        this.id = id;
    }


    /**
     * this is method is used to access to variable of the model.
     * @return column of widgetdata
     */
    public int getwColumn() {
        return wColumn;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param wColumn
     */
    public void setwColumn(final int wColumn) {
        this.wColumn = wColumn;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return row of widgetdata
     */
    public int getwRow() {
        return wRow;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param wRow
     */
    public void setwRow(final int wRow) {
        this.wRow = wRow;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return location of widgetdata
     */
    public String getLocation() {
        return location;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param location
     */
    public void setLocation(final String location) {
        this.location = location;
    }
}
