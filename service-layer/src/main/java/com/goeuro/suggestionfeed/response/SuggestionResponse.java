package com.goeuro.suggestionfeed.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuggestionResponse {


    /**
     * The ID in question.
     */
    @JsonProperty(value = "_id")
    private Integer id;

    /**
     * The suggestion name.
     */
    @JsonProperty(value = "name")
    private String name;


    /**
     * The suggestion type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The iata airport code
     */
    @JsonProperty(value = "iata_airport_code")
    private String iataAirportCode;

    /**
     * The suggestion geo position
     */
    @JsonProperty(value = "geo_position")
    private GeoPositionResponse geoPosition;

    public final Integer getId() {
        return id;
    }

    public final String getIataAirportCode() {
        return iataAirportCode;
    }

    public final void seId(Integer id) {
        this.id = id;
    }

    public final void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GeoPositionResponse getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(GeoPositionResponse geoPosition) {
        this.geoPosition = geoPosition;
    }
}