package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StorageTest {

    @Test
    public void getAllEmpty() {
        StorageImpl storage = new StorageImpl();
        int actual = storage.getAll().size();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled
    public void addTest() {
        StorageImpl storage = new StorageImpl();
        storage.add("водка", 500, 0.75);
        List<Product> actualList = storage.getAll();
        int actualSize = actualList.size();
        int expectedSize = 1;
        Assertions.assertEquals(expectedSize, actualSize);

        Product actualProduct = actualList.get(0);
        Product expectedProduct = new Product("водка", 500, 0.75);
        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void addNull() {
        StorageImpl storage = new StorageImpl();
        Assertions.assertThrows(NullPointerException.class, () -> storage.add(null, 12, 0.9));

    }
}
