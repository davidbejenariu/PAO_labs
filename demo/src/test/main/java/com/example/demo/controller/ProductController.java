package com.example.demo.controller;

import com.example.demo.model.Beer;
import com.example.demo.model.Chocolate;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;
    // nu se poate modifica referinta, dar obiectul se poate modifica
    // final e referinta, nu obiectul

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add-beer")
    public void addBeer(@RequestBody Beer beer) {
        productService.add(beer);
    }

    @PostMapping("/add-chocolate")
    public void addProduct(@RequestBody Chocolate chocolate) {
        productService.add(chocolate);
    }

    @GetMapping("/get-products")
    public List<Product> getAll() {
        return productService.getAll();
    }
}
