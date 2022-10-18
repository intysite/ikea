package org.example;

import java.util.List;

public interface Storage {
    void add(String name, int count, double weight);

    List<Product> getAll();
}
