package com.Antwan.WeatherWidget.model;

public class Weather {
    /**
     * this variable is the id of the weather of the widget.
     */
    private int id;
    /**
     * this variable contains the main info of the widget.
     */
    private String main;
    /**
     * this variable is the description of the weather of the widget.
     */
    private String description;
    /**
     * this variable is the icon name of the weather of the widget.
     */
    private String icon;
    /**
     * this is method is used to access to variable of the model.
     */
    public int getId() {
        return id;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setId(final int id) {
        this.id = id;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public String getMain() {
        return main;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setMain(final String main) {
        this.main = main;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public String getDescription() {
        return description;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setDescription(final String description) {
        this.description = description;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public String getIcon() {
        return icon;
    }
    /**
     * this is method is used to access to variable of the model.
     */
    public void setIcon(final String icon) {
        this.icon = icon;
    }
}
