package com.p1.model;

public class Billing {
    private int billId;
    private Product product;
    private int quantity;
    private double totalAmount;
    
    public Billing()
    {
    	
    }
	public Billing(int billId, Product product, int quantity, double totalAmount) {
		this.billId = billId;
		this.product = product;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

   
}