package com.goeuro.suggestionfeed;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class ServiceFactory {

    public static GoEuroService getService (String url) {

        Client client = ClientBuilder.newClient();
        ResteasyWebTarget target = (ResteasyWebTarget) client.target(url);
        return target.proxy(GoEuroService.class);

    }
}
