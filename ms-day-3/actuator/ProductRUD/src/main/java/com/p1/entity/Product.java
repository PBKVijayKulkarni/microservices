package com.p1.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    private int productId;

    private String pname;
    private String pcolor;
    private double prate;

    // Getters and Setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcolor() {
        return pcolor;
    }

    public void setPcolor(String pcolor) {
        this.pcolor = pcolor;
    }

    public double getPrate() {
        return prate;
    }

    public void setPrate(double prate) {
        this.prate = prate;
    }
}