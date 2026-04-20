package com.p1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.p1.entity.Product;

@FeignClient(name = "PRODUCT-SERVICE", url = "http://localhost:8081")
public interface ProductClient {

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable int id);
}