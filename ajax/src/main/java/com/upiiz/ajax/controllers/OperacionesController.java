package com.upiiz.ajax.controllers;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class OperacionesController {

    // EndPoint - Suma, Resta, Division, Multiplicacion
    // GET - Listados
    // POST - Operaciones, eliminar, actualizar registros
    @PostMapping("/operaciones/suma")
    public ResponseEntity<Map<String,Object>> sumaNumeros(@RequestBody Map<String,Object> numeros){
        /*
             {"estado": 1,
              "mensaje": "Operacion realizada",
              "resultado": 10
              }
              o
              {"estado": 0,
               "mensaje": "numero invalido"
               "resultado":
              }
         */
        double n1, n2;
        try {
            n1 = Double.parseDouble(numeros.get("n1").toString());
            n2 = Double.parseDouble(numeros.get("n2").toString());
            double suma = n1 + n2;
            return ResponseEntity.ok(Map.of(
                    "estado", 1,
                    "mensaje", "Operacion realizada con exito",
                    "resultado", suma
            ));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of(
                    "estado", 0,
                    "mensaje", "No se pudo realizar la operacion",
                    "resultado", 0
            ));
        }
    }

    @PostMapping("/operaciones/resta")
    public ResponseEntity<Map<String,Object>> restaNumeros(@RequestBody Map<String, Object> numeros){
        double n1, n2;

        try {
            n1 = Double.parseDouble(numeros.get("n1").toString());
            n2 = Double.parseDouble(numeros.get("n2").toString());
            double resta = n1 - n2;
            return ResponseEntity.ok(Map.of(
                    "estado", 1,
                    "mensaje", "Operacion realizada con exito",
                    "resultado", resta
            ));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of(
                    "estado", 0,
                    "mensaje", "No se pudo realizar la operacion",
                    "resultado", 0
            ));
        }
    }

    @PostMapping("/operaciones/multiplicacion")
    public ResponseEntity<Map<String, Object>> multiplicacionNumeros(@RequestBody Map<String, Object> numeros){
        double n1, n2;

        try {
            n1 = Double.parseDouble(numeros.get("n1").toString());
            n2 = Double.parseDouble(numeros.get("n2").toString());
            double multiplicacion = n1 * n2;
            return ResponseEntity.ok(Map.of(
                    "estado", 1,
                    "mensaje", "Operacion realizada con exito",
                    "resultado", multiplicacion
            ));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of(
                    "estado", 0,
                    "mensaje", "No se pudo realizar la operacion",
                    "resultado", 0
            ));
        }
    }

    @PostMapping("/operaciones/division")
    public ResponseEntity<Map<String, Object>> divisionNumeros(@RequestBody Map<String, Object> numeros){
        double n1, n2;

        try {
            n1 = Double.parseDouble(numeros.get("n1").toString());
            n2 = Double.parseDouble(numeros.get("n2").toString());
            double division = n1 / n2;
            return ResponseEntity.ok(Map.of(
                    "estado", 1,
                    "mensaje", "Operacion realizada con exito",
                    "resultado", division
            ));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of(
                    "estado", 0,
                    "mensaje", "No se pudo realizar la operacion",
                    "resultado", 0
            ));
        }
    }
}
