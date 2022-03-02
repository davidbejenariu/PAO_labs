package com.example.demo.model;

import java.math.BigDecimal;

public class Beer extends Product {
    private BigDecimal percentage;

    public Beer(int id, String name, BigDecimal percentage) {
        super(id, name);
        this.percentage = percentage;
    }
}
