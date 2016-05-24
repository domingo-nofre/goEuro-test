package com.goeuro.suggestionfeed;

import com.goeuro.suggestionfeed.response.SuggestionResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public interface GoEuroService {

    String JSON_MIME_TYPE = "application/json; charset=UTF-8";

    @GET
    @Path("/suggest/{language}/{cityName}")
    @Produces(JSON_MIME_TYPE)
    SuggestionResponse[] getSuggestions(@PathParam("language") String language, @PathParam("cityName") String cityName);

}