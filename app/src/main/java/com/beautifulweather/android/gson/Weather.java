package com.beautifulweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    public Weather weather;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
