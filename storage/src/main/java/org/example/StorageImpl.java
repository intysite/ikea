package org.example;

import java.util.ArrayList;
import java.util.List;

public class StorageImpl implements Storage {
    private List<Product> products = new ArrayList<>();

    @Override
    public void add(String name, int count, double weight) {
        products.add(new Product(name, count, weight));
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }
}
