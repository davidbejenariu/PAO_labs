package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);
    List<Product> getAll();
}
