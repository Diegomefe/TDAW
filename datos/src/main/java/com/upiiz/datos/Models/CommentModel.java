package com.upiiz.datos.Models;

public class CommentModel {
    private int id;
    private String text;
    private int idProduct;

    public CommentModel(int id, String text, int idProduct) {
        this.id = id;
        this.text = text;
        this.idProduct = idProduct;
    }
    public CommentModel() {

    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
