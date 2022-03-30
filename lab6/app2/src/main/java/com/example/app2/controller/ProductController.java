package com.example.app2.controller;

import com.example.app2.model.Product;
import com.example.app2.proxy.ProductProxy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductController {
    private final ProductProxy productProxy;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productProxy.getProducts();
    }
}
