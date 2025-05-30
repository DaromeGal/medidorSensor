package com.cebem.medidor.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pelicula {

    @JsonProperty("Title")
    private String titulo;

    @JsonProperty("Year")
    private String anio;

    @JsonProperty("Genre")
    private String genero;

    @JsonProperty("Director")
    private String director;

    @JsonProperty("Plot")
    private String argumento;

    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("imdbRating")
    private String imdbRating;
}
