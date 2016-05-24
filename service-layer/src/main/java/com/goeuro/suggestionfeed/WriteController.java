package com.goeuro.suggestionfeed;

import com.goeuro.suggestionfeed.parameters.WriteParameters;
import com.google.inject.Singleton;
import com.opencsv.CSVWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

@Singleton
public class WriteController {

    private static final String CSV_HEADER = "_Id#name#type#latitude#longitude";
    private static final String CSV_HEADER_SEPARATOR = "#";
    private static final char CSV_SEPARATOR = ';';
    private static final String CHARSET = "UTF-8";

    public void writeSuggestions (WriteParameters parameters) {

        try {
            CSVWriter writer = null;
            writer = new CSVWriter(new OutputStreamWriter(new FileOutputStream(parameters.getFilename()),
                    Charset.forName(CHARSET)), CSV_SEPARATOR);
            String[] header = CSV_HEADER.split(CSV_HEADER_SEPARATOR);
            writer.writeNext(header);
            for (Suggestion suggestion : parameters.getSuggestions()) {
                String row[] = new String[5];
                row[0] = suggestion.getId().toString();
                row[1] = suggestion.getName();
                row[2] = suggestion.getType();
                row[3] = suggestion.getGeoPosition().getLatitude().toString();
                row[4] = suggestion.getGeoPosition().getLongitude().toString();
                writer.writeNext(row);
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error creating the CSV file.");
        }
    }
}
