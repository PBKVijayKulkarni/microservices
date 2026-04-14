package com.p1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.Order;
import com.p1.model.Product;

@Service
public class BillingService {
	
	    @Autowired
	    private ProductService productService;

	    public double generateBill(Order order) {
	        Product product = productService.getProductById(order.getProductId());

	        if (product == null) {
	            throw new RuntimeException("Product not found");
	        }

	        return product.getPrice() * order.getQuantity();
	    }
	}
