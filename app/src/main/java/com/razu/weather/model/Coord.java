package com.razu.weather.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coord implements Serializable {

    @SerializedName("lat")
    private float lat;

    @SerializedName("lon")
    private float lon;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }
}