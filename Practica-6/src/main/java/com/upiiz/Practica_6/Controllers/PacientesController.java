package com.upiiz.Practica_6.Controllers;

import com.upiiz.Practica_6.Models.PacientesModel;
import com.upiiz.Practica_6.Services.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PacientesController {
    @Autowired
    private PacientesService pacientesService;

    @GetMapping("/pacientes")
    public String pacientes(Model model){
        List<PacientesModel> pacientes = pacientesService.findAll();
        model.addAttribute("pacientes", pacientes);
        return "listado-pacientes";
    }

    @GetMapping("/pacientes/new")
    public String mostrarFormularioPaciente(Model model){
        PacientesModel paciente = new PacientesModel();
        model.addAttribute("paciente", paciente);
        return "agregar-paciente";
    }

    @PostMapping("/pacientes/guardar")
    public String guardarPaciente(@ModelAttribute PacientesModel paciente){
        pacientesService.save(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/pacientes/delete/{id}")
    public String mostrarFormularioEliminar(@PathVariable int id, Model model){
        PacientesModel paciente = pacientesService.findById(id);
        model.addAttribute("paciente", paciente);
        return "eliminar-paciente";
    }

    @PostMapping("/pacientes/delete")
    public String eliminarPaciente(@ModelAttribute PacientesModel paciente){
        pacientesService.delete(paciente.getId());
        return "redirect:/pacientes";
    }

    @GetMapping("/pacientes/edit/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model){
        PacientesModel paciente = pacientesService.findById(id);
        model.addAttribute("paciente", paciente);
        return "editar-paciente";
    }

    @PostMapping("/pacientes/edit")
    public String editarPaciente(@ModelAttribute PacientesModel paciente){
        pacientesService.update(paciente);
        return "redirect:/pacientes";
    }
}


