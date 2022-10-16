package com.Antwan.WeatherWidget.model;




public class Widget {

    private int id;
    private String name;
    private int celsius;
    private Main main;
    private Weather[] weather;
    private Sys sys;
    private Coord coord;



    public Widget() {
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String location) {
        this.name = location;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
    public Weather[] getWeather() {
        return weather;
    }


    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }
}
