package com.p1.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.p1.model.Product;

@Service
public class ProductService {

    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Laptop", 50000));
        products.put(2, new Product(2, "Mobile", 20000));
    }

    public Product getProduct(int id) {
        return products.get(id);
    }
}