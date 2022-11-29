package com.Antwan.WeatherWidget.model;

public class Sys {

    /**
     * this variable is the country of the widget.
     */
    private String country;
    /**
     * this is method is used to access to variable of the model.
     * @return the country of the widget
     */
    public String getCountry() {
        return country;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param country
     */
    public void setCountry(final String country) {
        this.country = country;
    }
}
