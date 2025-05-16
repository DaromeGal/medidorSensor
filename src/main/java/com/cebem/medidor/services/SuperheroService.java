package com.cebem.medidor.services;

import com.cebem.medidor.models.Superhero;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SuperheroService {

    private final String API_URL = "https://superheroapi.com/api/{apiKey}/{id}";
    private final String API_KEY = "https://superheroapi.com/api/ca6bd70e65c6df532bc93ee3a4ba2e31";

    private final RestTemplate restTemplate;

    public SuperheroService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Superhero getSuperheroById(String id) {
        String url = API_URL.replace("{apiKey}", API_KEY).replace("{id}", id);
        return restTemplate.getForObject(url, Superhero.class);
    }

    public Superhero getRandomSuperhero() {
        int randomId = new Random().nextInt(731) + 1; // Rango válido: 1 - 731
        return getSuperheroById(String.valueOf(randomId));
    }
}