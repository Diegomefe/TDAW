package com.upiiz.plantilla.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping ("/elements")
    public String elements(){
        return "elements";
    }

    @GetMapping ("/generic")
    public String generics(){
        return "generic";
    }
}
