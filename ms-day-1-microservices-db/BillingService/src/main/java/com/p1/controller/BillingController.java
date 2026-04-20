package com.p1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.entity.Bill;
import com.p1.repository.BillRepository;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillRepository repo;

    @PostMapping
    public Bill create(@RequestBody Bill bill) {
        return repo.save(bill);
    }

    @GetMapping
    public List<Bill> getAll() {
        return repo.findAll();
    }
}