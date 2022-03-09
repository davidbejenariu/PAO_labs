package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @ - Adnotare (implementare asemanatoare interfetei)
 * are rolul de a marca caracteristicile unui element de limbaj, ne ajuta la specificarea de metadate
 * framework-ul Spring trebuie sa stie ca acesta e repository si stie sa interpreteze adnotarea
 */

@Repository
public class ProductRepository implements IProductRepository {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
