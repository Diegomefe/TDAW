package com.upiiz.ExamenII.Controllers;

import com.upiiz.ExamenII.Models.ReservacionModel;
import com.upiiz.ExamenII.Services.ReservacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReservacionController {
    @Autowired
    private ReservacionService reservacionService;
    @GetMapping("/tabla")
    public String products(Model model) {
        List<ReservacionModel> productos = reservacionService.findAll();
        model.addAttribute("productos", productos);
        return "listado-reservas";
    }

    @GetMapping("/tabla/nuevo")
    public String mostrarFormularioProduct(Model model) {
        ReservacionModel producto = new ReservacionModel();
        model.addAttribute("producto", producto);
        return "agregar-reserva";
    }

    @PostMapping("/tabla/guardar")
    public String guardarProducto(@ModelAttribute ReservacionModel reserva){
        reservacionService.save(reserva);
        return "redirect:/tabla";
    }

    @GetMapping("/tabla/eliminar/{id}")
    public String mostrarFormularioEliminarProducto(@PathVariable int id, Model model){
        //Mostrar al usuario el registro que va a eliminar
        ReservacionModel producto = reservacionService.findById(id);
        model.addAttribute("producto", producto);
        return "eliminar-reserva";
    }

    @PostMapping("/tabla/delete")
    public String eliminarProducto(@ModelAttribute ReservacionModel producto){
        reservacionService.delete(producto.getId());
        return "redirect:/tabla";
    }

    @GetMapping("/tabla/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable int id, Model model){
        ReservacionModel producto = reservacionService.findById(id);
        model.addAttribute("producto", producto);
        return "editar-reserva";
    }

    @PostMapping("/tabla/edit")
    public String editarProducto(@ModelAttribute ReservacionModel producto){
        reservacionService.update(producto);
        return "redirect:/tabla";
    }

}
