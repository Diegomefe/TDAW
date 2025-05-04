package com.upiiz.Practica_6.Models;

public class MedicosModel {

    private int id_medico;
    private String nombre;
    private String especialidad;
    private String matricula;

    public MedicosModel(int id_medico, String nombre, String especialidad, String matricula) {
        this.id_medico = id_medico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.matricula = matricula;
    }

    public MedicosModel() {
    }

    public int getId() {
        return id_medico;
    }

    public void setId(int id) {
        this.id_medico = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
