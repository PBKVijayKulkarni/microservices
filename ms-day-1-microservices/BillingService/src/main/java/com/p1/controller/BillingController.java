package com.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.Bill;
import com.p1.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingService service;

    @GetMapping("/{id}/{qty}")
    public Bill getBill(@PathVariable int id, @PathVariable int qty) {
        return service.generateBill(id, qty);
    }
}