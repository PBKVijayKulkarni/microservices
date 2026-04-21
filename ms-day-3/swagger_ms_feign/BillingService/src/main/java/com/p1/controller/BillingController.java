package com.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.LogisticsClient;
import com.p1.model.Shipment;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private LogisticsClient logisticsClient;

    @PostMapping("/create")
    public Shipment createShipment(@RequestBody Shipment shipment) {
        return logisticsClient.addShipment(shipment);
    }

    @GetMapping("/fetch/{id}")
    public Shipment fetchShipment(@PathVariable int id) {
        return logisticsClient.getShipment(id);
    }
}