package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.model.Data;
import org.springframework.web.reactive.function.client.WebClient;

public class Coordinates {
    public final WebClient webClient;

    public Coordinates(String baseUrl) {
        this.webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    public Data getData() {
        return webClient.get().retrieve().bodyToMono(Data.class).block();
    }
}
