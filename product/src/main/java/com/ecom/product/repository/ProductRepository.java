package com.ecom.product.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findByCategory(String category);
}

