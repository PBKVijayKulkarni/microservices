package com.p1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping(value="/{id}", produces = "application/json")
    public Product getProduct(@PathVariable int id) {
        return new Product(id, "Laptop", 50000.00);
    }
}