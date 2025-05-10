package com.upiiz.Examen1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String log(){
        return "index";
    }

    @PostMapping("/login/listado")
    public String listado(){
        return "proveedores - listado";
    }

    @GetMapping("/login/editar")
        public String editar(){
        return "proveedores - actualizar";
    }

    @GetMapping("/login/agregar")
    public String agregar(){
        return "proveedores - agregar";
    }

    @GetMapping("/login/eliminar")
    public String eliminar(){
        return "proveedores - eliminar";
    }

    @PostMapping("/login/actualizar")
    public String editPost(){
        return "redirect:/login/listado";
    }
}
