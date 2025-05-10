package com.upiiz.Practica_6.Models;

import java.sql.Date;

public class PacientesModel {

    private int idPaciente;
    private String nombre;
    private int dni;
    private Date fecha_nacimiento;

    public PacientesModel(int idPaciente, String nombre, int dni, Date fecha_nacimiento) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public PacientesModel() {
    }

    public int getId() {
        return idPaciente;
    }

    public void setId(int id) {
        this.idPaciente = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
