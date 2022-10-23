import org.example.Product;
import org.example.StorageImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


public class ShopIT {
    @Test
    @DisplayName("Добавление товара в магазин")
    public void addTest() {
        StorageImpl storage = new StorageImpl();
        ShopImpl shop = new ShopImpl(storage);
        shop.add("bread", 12, 0.85);
        List<Product> actualList = storage.getAll();
        int actualSize = actualList.size();
        int expectedSize = 1;
        Assertions.assertEquals(expectedSize, actualSize);

        Product actualProduct = actualList.get(0);
        Product expectedProduct = new Product("bread", 12, 0.85);
        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    @DisplayName("Подсчет количества товаров")
    public void check() {
        StorageImpl storage = new StorageImpl();
        ShopImpl shop = new ShopImpl(storage);
        shop.add("apple", 35, 2.79);
        shop.add("pear", 54, 5.15);
        Integer actualCount = shop.check();
        Integer expectedCount = (35 + 54) * 40;
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
