package com.cebem.medidor.services;

import com.cebem.medidor.models.Pelicula;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PeliculaService {

    // Tu clave API OMDb
    @Value("${omdbapi.key:232df60a}")
    private String apiKey;

    // URL base de OMDb (sin parámetros)
    @Value("${omdbapi.url:http://www.omdbapi.com/}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public Pelicula buscarPeliculaPorTitulo(String titulo) {
        String url = apiUrl + "?t=" + titulo + "&apikey=" + apiKey;
        return restTemplate.getForObject(url, Pelicula.class);
    }
}
