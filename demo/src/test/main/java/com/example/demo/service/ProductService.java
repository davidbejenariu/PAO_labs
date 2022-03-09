package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    // final ~ const pt referinta
    private final IProductRepository productRepository;

    private ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void add(Product product) {
        productRepository.add(product);
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
