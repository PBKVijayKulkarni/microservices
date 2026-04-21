package com.p1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.Shipment;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    private List<Shipment> shipments = new ArrayList<>();

    @PostMapping("/add")
    public Shipment addShipment(@RequestBody Shipment shipment) {
        shipments.add(shipment);
        return shipment;
    }

    @GetMapping("/get/{id}")
    public Shipment getShipment(@PathVariable int id) {
        return shipments.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }
}