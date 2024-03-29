package com.Antwan.WeatherWidget.model;

public class Main {
    /**
     * this variable is the temperature of the widget.
     */
   private float temp;
    /**
     * this variable is the temperature how people feel it of the widget.
     */
   private float feels_like;
    /**
     * this variable is the minimum temperature of the widget.
     */
   private float temp_min;
    /**
     * this variable is the maximum temperature of the widget.
     */
   private float temp_max;
    /**
     * this variable is the pressure of the widget.
     */
   private float pressure;
    /**
     * this variable is the humidity of the widget.
     */
   private float humidity;

    /**
     * this is method is used to access to variable of the model.
     * @return the temperature
     */
    public float getTemp() {
        return temp;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return feel like temperature
     */
    public float getFeels_like() {
        return feels_like;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param feels_like
     */
    public void setFeels_like(final float feels_like) {
        this.feels_like = feels_like;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return the minimum temperature
     */
    public float getTemp_min() {
        return temp_min;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param temp_min
     */
    public void setTemp_min(final float temp_min) {
        this.temp_min = temp_min;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return the maximum temperature
     */
    public float getTemp_max() {
        return temp_max;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param temp_max
     */
    public void setTemp_max(final float temp_max) {
        this.temp_max = temp_max;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return pressure of widget
     */
    public float getPressure() {
        return pressure;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param pressure
     */
    public void setPressure(final float pressure) {
        this.pressure = pressure;
    }
    /**
     * this is method is used to access to variable of the model.
     * @return humidity of widget
     */
    public float getHumidity() {
        return humidity;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param humidity
     */
    public void setHumidity(final float humidity) {
        this.humidity = humidity;
    }
    /**
     * this is method is used to access to variable of the model.
     * @param temp
     */
    public void setTemp(final float temp) {
        this.temp = temp;
    }
}
