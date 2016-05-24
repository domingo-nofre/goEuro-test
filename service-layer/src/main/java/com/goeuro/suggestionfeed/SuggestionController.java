package com.goeuro.suggestionfeed;

import com.goeuro.suggestionfeed.parameters.SuggestionParameters;
import com.goeuro.suggestionfeed.response.SuggestionResponse;
import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class SuggestionController {

    private static final String GO_EURO_URL = "http://api.goeuro.com/api/v2/position/";

    public List<Suggestion> retrieveSuggestions(SuggestionParameters parameters) {

        List<Suggestion> suggestions = new ArrayList<Suggestion>();

        try {
            GoEuroService service = ServiceFactory.getService(GO_EURO_URL);

            SuggestionResponse[] responses = service.getSuggestions(parameters.getLocale(), parameters.getText());

            if (responses != null) {
                for (SuggestionResponse response : responses) {
                    suggestions.add(new Suggestion(response.getId(),
                            response.getName(),
                            response.getType(),
                            response.getIataAirportCode(),
                            new GeoPosition(response.getGeoPosition().getLatitude(), response.getGeoPosition().getLongitude())));
                }
            }
        }catch (RuntimeException e){
            System.out.println("Error connecting to suggestion service.");
        }

        return suggestions;
    }
}
