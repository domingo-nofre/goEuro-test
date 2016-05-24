package com.goeuro.suggestionfeed;


public class GeoPosition {

    private final Float latitude;
    private final Float longitude;

    public GeoPosition(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }
}
