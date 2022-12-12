package com.Antwan.WeatherWidget.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
@JsonIgnoreProperties("user")
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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
    public WidgetData(final int column, final int row, final String location, final User user) {
        this.wColumn = column;
        this.location = location;
        this.wRow = row;
        this.user = user;
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
