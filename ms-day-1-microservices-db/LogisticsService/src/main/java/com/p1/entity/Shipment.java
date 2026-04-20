package com.p1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Shipment {
    @Id
    @GeneratedValue
    private Long id;
    private String shipmentStatus;
    private String address;
	
    public Shipment()
	{ }
	
    public Shipment(Long id, String shipmentStatus, String address) {
		this.id = id;
		this.shipmentStatus = shipmentStatus;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShipmentstatus() {
		return shipmentStatus;
	}
	public void setStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}