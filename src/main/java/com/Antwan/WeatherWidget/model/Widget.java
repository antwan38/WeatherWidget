package com.Antwan.WeatherWidget.model;




public class Widget {
    /**
     * this variable is the id of the widget.
     */
    private int id;
    /**
     * this variable is the name of the widget.
     */
    private String name;
    /**
     * this variable is the celsius of the widget.
     */
    private int celsius;
    /**
     * this variable contains the main info of the widget.
     */
    private Main main;
    /**
     * this variable contains all the info of the weather of the widget.
     */
    private Weather[] weather;
    /**
     * this variable contains the info of the country of the widget.
     */
    private Sys sys;
    /**
     * this variable contains the coords of the widget.
     */
    private Coord coord;



    /**
     * this is method is used to access to variable of the model.
     * @return the coord of the widget
     */
    public Coord getCoord() {
        return coord;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param coord
     */
    public void setCoord(final Coord coord) {
        this.coord = coord;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return id of widget
     */
    public int getId() {
        return id;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param id
     */
    public void setId(final int id) {
        this.id = id;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return name of widget
     */
    public String getName() {
        return name;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param location
     */
    public void setName(final String location) {
        this.name = location;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return celsius of widget
     */
    public int getCelsius() {
        return celsius;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param celsius
     */
    public void setCelsius(final int celsius) {
        this.celsius = celsius;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return main info of widget
     */
    public Main getMain() {
        return main;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param main
     */
    public void setMain(final Main main) {
        this.main = main;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return weater of widget
     */
    public Weather[] getWeather() {
        return weather;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return sys of widget
     */
    public Sys getSys() {
        return sys;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param sys
     */
    public void setSys(final Sys sys) {
        this.sys = sys;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param weather
     */
    public void setWeather(final Weather[] weather) {
        this.weather = weather;
    }
}
