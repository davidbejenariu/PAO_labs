package com.example.app2.proxy;

import com.example.app2.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "Products", url = "http://localhost:8080")
public interface ProductProxy {
    @GetMapping("/api/products")
    List<Product> getProducts();
}
