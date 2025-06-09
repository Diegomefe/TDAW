package com.upiiz.Ejercicio18_Buscador.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/search")
public class HomeController {

    @GetMapping("/suggestions")
    public List<String> getSuggestions(@RequestParam String query) {
        // Simulando datos (puedes cambiarlo por base de datos)
        List<String> datos = List.of(
                "IPN Zacatecas", "CECyT 18", "UPIICSA", "UPIITA",
                "ESIME", "ESCOM", "ESCA", "ENCB", "ESIA", "CICS"
        );

        return datos.stream()
                .filter(nombre -> nombre.toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
