package com.upiiz.ExamenII.Models;

import java.sql.Date;

public class ReservacionModel {
    private int id;
    private String nombre_cliente;
    private Date fecha_entrada;
    private Date fecha_salida;

    public ReservacionModel(int id, String nombre_cliente, Date fecha_entrada, Date fecha_salida) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }

    public ReservacionModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
