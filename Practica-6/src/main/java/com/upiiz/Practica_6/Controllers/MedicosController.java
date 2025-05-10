package com.upiiz.Practica_6.Controllers;

import com.upiiz.Practica_6.Models.MedicosModel;
import com.upiiz.Practica_6.Services.MedicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MedicosController {
    @Autowired
    private MedicosService medicosService;

    @GetMapping("/medicos")
    public String medicos(Model model){
        List<MedicosModel> medicos = medicosService.findAll();
        model.addAttribute("medicos", medicos);
        return "listado-medicos";
    }

    @GetMapping("/medicos/new")
    public String mostrarFormularioMedico(Model model){
        MedicosModel medico = new MedicosModel();
        model.addAttribute("medico", medico);
        return "agregar-medico";
    }

    @PostMapping("/medicos/guardar")
    public String guardarMedico(@ModelAttribute MedicosModel medico){
        medicosService.save(medico);
        return "redirect:/medicos";
    }

    @GetMapping("/medicos/delete/{id}")
    public String mostrarFormularioEliminar(@PathVariable int id, Model model){
        MedicosModel medico = medicosService.findById(id);
        model.addAttribute("medico", medico);
        return "eliminar-medico";
    }

    @PostMapping("/medicos/delete")
    public String eliminarMedico(@ModelAttribute MedicosModel medico){
        medicosService.delete(medico.getId());
        return "redirect:/medicos";
    }

    @GetMapping("/medicos/edit/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model){
        MedicosModel medico = medicosService.findById(id);
        model.addAttribute("medico", medico);
        return "editar-medico";
    }

    @PostMapping("/medicos/edit")
    public String editarMedico(@ModelAttribute MedicosModel medico){
        medicosService.update(medico);
        return "redirect:/medicos";
    }
}
