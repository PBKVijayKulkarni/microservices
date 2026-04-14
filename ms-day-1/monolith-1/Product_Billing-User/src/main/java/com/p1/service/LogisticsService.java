package com.p1.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.p1.model.Shipment;

@Service
public class LogisticsService {

    private Map<Integer, Shipment> shipmentMap = new HashMap<>();

    public Shipment createShipment(int userId) {
        Shipment shipment = new Shipment(userId, "CREATED");
        shipmentMap.put(userId, shipment);
        return shipment;
    }

    public Shipment getShipment(int userId) {
        return shipmentMap.get(userId);
    }
}