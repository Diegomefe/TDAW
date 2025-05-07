package com.upiiz.datos.Models;

import java.util.ArrayList;

public class ProductModel {

    private int id;
    private String name;
    private double price;
    private boolean inStock;
    private ArrayList<CommentModel> comments;
    public ProductModel() {}
    public ProductModel(int id, String name, double price, boolean inStock, ArrayList<CommentModel> comments) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.comments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public ArrayList<CommentModel> getComments() {
        return comments;
    }

    public void setComments(ArrayList<CommentModel> comments) {
        this.comments = comments;
    }
    public void addComment(CommentModel comment) {
        this.comments.add(comment);
    }
}
