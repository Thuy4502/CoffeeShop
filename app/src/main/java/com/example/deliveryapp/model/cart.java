package com.example.deliveryapp.model;

import java.io.Serializable;

public class cart implements Serializable {
    private int id;
    private String name;
    private long price;
    private int quantity;
    private int img;


    public cart() {
    }

    public cart(int id, String name, long price, int quantity, int img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
