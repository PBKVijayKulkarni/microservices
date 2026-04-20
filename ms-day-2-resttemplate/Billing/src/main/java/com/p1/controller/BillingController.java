package com.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.p1.model.Billing;
import com.p1.model.Product;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{productId}/{qty}")
    public Billing generateBill(@PathVariable int productId, @PathVariable int qty) {

        // Call Product Service
        String url = "http://localhost:8081/product/" + productId;
        Product product = restTemplate.getForObject(url, Product.class);

        // Create Bill
        Billing bill = new Billing();
        bill.setBillId(1);
        bill.setProduct(product);
        bill.setQuantity(qty);
        bill.setTotalAmount(product.getPrice() * qty);

        return bill;
    }
}