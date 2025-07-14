package com.ecom.product.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.product.entity.Product;
import com.ecom.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class ProductService {

	
    private final ProductRepository repository;

		public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
   // @WithSpan  // OpenTelemetry span annotation
    public Product saveProduct(Product product) {
        product.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return repository.save(product);
    }

   // @WithSpan
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

   // @WithSpan
    public Optional<Product> getProductById(UUID id) {
        return repository.findById(id);
    }

   // @WithSpan
    public List<Product> getProductsByCategory(String category) {
        return repository.findByCategory(category);
    }
}

