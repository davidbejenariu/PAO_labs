package com.example.pao_lab3_e1e.repository;

import com.example.pao_lab3_e1e.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void addProduct(Product product) {
        System.out.println("Am adaugat produsul\n");
    }
}
