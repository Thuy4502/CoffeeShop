package com.example.deliveryapp.model;

import java.io.Serializable;

public class product implements Serializable {
    private int productId;
    private String productName;
    private long price;
    private int imageId;
    private int quantity;

    public product() {
    }

    public product(int productId, String productName, long price, int imageId, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.imageId = imageId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", imageId=" + imageId +
                ", quantity=" + quantity +
                '}';
    }
}
