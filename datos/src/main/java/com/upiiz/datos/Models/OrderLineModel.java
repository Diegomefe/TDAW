package com.upiiz.datos.Models;

public class OrderLineModel {
    private ProductModel productModel;
    private int amount;
    private double pucharsePrice;

    public OrderLineModel(ProductModel productModel, int amount, double pucharsePrice) {
        this.productModel = productModel;
        this.amount = amount;
        this.pucharsePrice = pucharsePrice;
    }
    public OrderLineModel() {

    }

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPucharsePrice() {
        return pucharsePrice;
    }

    public void setPucharsePrice(double pucharsePrice) {
        this.pucharsePrice = pucharsePrice;
    }
}
