package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Product {
    @NonNull
    private String name;
    private int count;
    private double weight;
}
