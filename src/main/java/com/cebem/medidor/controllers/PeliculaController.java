package com.cebem.medidor.controllers;

import com.cebem.medidor.models.Pelicula;
import com.cebem.medidor.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario";
    }

    @GetMapping("/buscar")
    public String buscarPelicula(@RequestParam String titulo, Model model) {
        Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo(titulo);
        model.addAttribute("pelicula", pelicula);
        return "resultado";
    }
}
