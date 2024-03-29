package com.Antwan.WeatherWidget.model;

public class Coord {

    /**
     * this variable is the longitude of the widget.
     */
    private float lon;
    /**
     * this variable is the latitude of the widget.
     */
    private float lat;
    /**
     * this is method is used to access to variable of the model.
     * @return longitude of widget
     */
    public float getLon() {
        return lon;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param lon
     */
    public void setLon(final float lon) {
        this.lon = lon;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return latitude of widget
     */
    public float getLat() {
        return lat;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param lat
     */
    public void setLat(final float lat) {
        this.lat = lat;
    }
}
