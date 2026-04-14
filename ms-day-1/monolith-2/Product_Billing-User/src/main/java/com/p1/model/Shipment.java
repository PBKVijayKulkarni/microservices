package com.p1.model;

public class Shipment {
    private int userId;
    private String status;

    public Shipment(int userId, String status) {
        this.userId = userId;
        this.status = status;
    }

    public int getUserId() { return userId; }
    public String getStatus() { return status; }
}