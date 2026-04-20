package com.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.ProductClient;
import com.p1.entity.Product;
import com.p1.model.Billing;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/{productId}/{qty}")
    public Billing generateBill(@PathVariable int productId, @PathVariable int qty) {

        Product product = productClient.getProductById(productId);

        Billing bill = new Billing();
        bill.setBillId(1);
        bill.setProduct(product);
        bill.setQuantity(qty);
        bill.setTotalAmount(product.getPrice() * qty);

        return bill;
    }
}