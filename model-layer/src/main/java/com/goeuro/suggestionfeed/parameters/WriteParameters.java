package com.goeuro.suggestionfeed.parameters;

import com.goeuro.suggestionfeed.Suggestion;

import java.util.List;

public class WriteParameters {

    private final List<Suggestion> suggestions;
    private String filename = "output.csv";

    public WriteParameters(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
