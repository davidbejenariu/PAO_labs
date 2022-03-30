package com.example.app1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// folosim Serializable (implements Serializable) cand scriem obiecte in fisier
public class Product {
    private String name;
    private BigDecimal price;
}
