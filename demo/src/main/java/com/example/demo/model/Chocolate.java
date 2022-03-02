package com.example.demo.model;

public class Chocolate extends Product {
    private int kcal;

    public Chocolate(int id, String name, int kcal) {
        super(id, name);
        this.kcal = kcal;
    }
}
