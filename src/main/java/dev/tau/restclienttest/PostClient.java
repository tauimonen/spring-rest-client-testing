package dev.tau.restclienttest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class PostClient {

    private final RestClient restClient;

    public PostClient(RestClient.Builder builder) {
        this.restClient = builder.build();
    }

}