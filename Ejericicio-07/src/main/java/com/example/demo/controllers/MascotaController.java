package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotaController {
    @GetMapping("/mascotas")
    public String listadoMascota(){
        return "mascotas/mascotas - listado";
    }

    @GetMapping("/mascotas/actualizar")
    public String formularioActualizarMascota(){
        return "mascotas/mascotas - actualizar";
    }

    @GetMapping("/mascotas/eliminar")
    public String eliminarMascota(){
        return "mascotas/mascotas - eliminar";
    }
    @GetMapping("/mascotas/agregar")
    public String mostrarGuardar(){
        return "mascotas/mascotas - agregar";
    }

    @PostMapping("/mascotas/guardar")
    public String agregarMascota(){
        //Guardamos la mascota y redireccionamos al listado
        return "redirect:/mascotas";
    }

    @PostMapping("/mascotas/actualizar")
    public String actualizarMascota(){
        //Aqui deberiamos actualizar la mascota en al DB
        //Redireccionamos al listado de mascotas
        return "redirect:/mascotas";
    }

    @PostMapping("/mascotas/eliminar")
    public String eliminarMascotas(){
        //Aqui deberiamos eliminar de la DB
        //redireccionamos al listado de mascotas
        return "redirect:/mascotas";
    }
}
