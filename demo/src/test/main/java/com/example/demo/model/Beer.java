package com.example.demo.model;

import java.math.BigDecimal;

public class Beer extends Product {
    private BigDecimal percentage;

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public Beer(int id, String name, BigDecimal percentage) {
        super(id, name);
        this.percentage = percentage;
    }
}
