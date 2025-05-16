package com.cebem.medidor.controllers;

import com.cebem.medidor.models.Superhero;
import com.cebem.medidor.services.SuperheroService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    private final SuperheroService superheroService;

    public ViewController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("/superhero")
    public String showSuperheroById(@RequestParam("id") String id, Model model) {
        Superhero superhero = superheroService.getSuperheroById(id);
        model.addAttribute("superhero", superhero);
        return "superhero-card";
    }

    @GetMapping("/superhero/random")
    public String showRandomSuperhero(Model model) {
        Superhero superhero = superheroService.getRandomSuperhero();
        model.addAttribute("superhero", superhero);
        return "superhero-card";
    }
}
