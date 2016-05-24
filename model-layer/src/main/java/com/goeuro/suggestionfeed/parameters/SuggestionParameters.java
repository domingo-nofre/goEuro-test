package com.goeuro.suggestionfeed.parameters;

/**
 * Created by domingo.nofre on 23/05/2016.
 */
public class SuggestionParameters {

    private final String text;
    private String locale = "en";

    public SuggestionParameters(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }
}
