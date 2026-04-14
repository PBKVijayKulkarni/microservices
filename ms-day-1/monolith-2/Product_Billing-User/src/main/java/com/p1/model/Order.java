package com.p1.model;

public class Order {
    private int userId;
    private double amount;

    public Order(int userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public int getUserId() { return userId; }
    public double getAmount() { return amount; }
}