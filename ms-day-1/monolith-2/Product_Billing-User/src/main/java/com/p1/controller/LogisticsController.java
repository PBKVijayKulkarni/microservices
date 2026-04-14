package com.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.Shipment;
import com.p1.service.LogisticsService;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    @Autowired
    private LogisticsService logisticsService;

    @GetMapping("/{userId}")
    public Shipment getShipment(@PathVariable int userId) {
        return logisticsService.getShipment(userId);
    }
}