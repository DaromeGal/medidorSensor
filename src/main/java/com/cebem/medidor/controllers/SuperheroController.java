package com.cebem.medidor.controllers;

import com.cebem.medidor.models.Superhero;
import com.cebem.medidor.services.SuperheroService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/superheroes")
public class SuperheroController {

    private final SuperheroService superheroService;

    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("/{id}")
    public Superhero getSuperhero(@PathVariable String id) {
        return superheroService.getSuperheroById(id);
    }

    @GetMapping("/random")
    public Superhero getRandomSuperhero() {
        return superheroService.getRandomSuperhero();
    }
}