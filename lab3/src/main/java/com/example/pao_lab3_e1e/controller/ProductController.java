package com.example.pao_lab3_e1e.controller;

import com.example.pao_lab3_e1e.model.Product;
import com.example.pao_lab3_e1e.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
}
