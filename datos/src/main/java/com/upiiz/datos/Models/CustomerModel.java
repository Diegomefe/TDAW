package com.upiiz.datos.Models;
import java.util.Date;

public class CustomerModel {
    private int id;
    private String name;
    private Date costumerSince;

    public CustomerModel(int id, String name, Date costumerSince) {
        this.id = id;
        this.name = name;
        this.costumerSince = costumerSince;

    }
}
