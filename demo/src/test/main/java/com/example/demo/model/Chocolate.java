package com.example.demo.model;

public class Chocolate extends Product {
    private int kcal;

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public Chocolate(int id, String name, int kcal) {
        super(id, name);
        this.kcal = kcal;
    }
}
