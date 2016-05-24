package com.goeuro.suggestionfeed;

import com.goeuro.suggestionfeed.parameters.SuggestionParameters;
import com.goeuro.suggestionfeed.parameters.WriteParameters;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector();

        SuggestionController controller = injector.getInstance(SuggestionController.class);

        if (args.length < 1) {
            System.out.println("Incorrect parameters number\n\n" +
                    "Usage:\n" +
                    "java -jar artifact_name city_name [locale] [filename]");
            System.exit(1);
        }

        SuggestionParameters parameters = new SuggestionParameters(args[0]);
        if (args.length > 1) {
            parameters.setLocale(args[1]);
        }

        List<Suggestion> suggestions = controller.retrieveSuggestions(parameters);
        System.out.println("READ FINISHED.");

        WriteParameters writeParameters = new WriteParameters(suggestions);
        if (args.length > 2) {
            writeParameters.setFilename(args[2]);
        }
        WriteController writer = injector.getInstance(WriteController.class);

        writer.writeSuggestions(writeParameters);
        System.out.println("WRITE FINISHED.");
    }
}
