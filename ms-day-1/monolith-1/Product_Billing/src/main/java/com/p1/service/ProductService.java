package com.p1.service;

import com.p1.model.Product;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private Map<Integer, Product> productMap = new HashMap<>();

    public ProductService() {
        productMap.put(1, new Product(1, "Laptop", 50000));
        productMap.put(2, new Product(2, "Phone", 20000));
    }

    public Collection<Product> getAllProducts() {
        return productMap.values();
    }

    public Product getProductById(int id) {
        return productMap.get(id);
    }
}