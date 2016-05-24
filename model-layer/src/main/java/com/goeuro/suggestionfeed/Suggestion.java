package com.goeuro.suggestionfeed;

public class Suggestion {

    private final Integer id;
    private final String name;
    private final String type;
    private final String iataAirportCode;
    private final GeoPosition geoPosition;

    public Suggestion(Integer id, String name, String type, String iataAirportCode, GeoPosition geoPosition) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.iataAirportCode = iataAirportCode;
        this.geoPosition = geoPosition;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public GeoPosition getGeoPosition() {
        return geoPosition;
    }
}
