package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.p1.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}