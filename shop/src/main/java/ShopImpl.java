import org.example.Product;
import org.example.StorageImpl;

public class ShopImpl implements Shop {
    private StorageImpl storage;

    public ShopImpl(StorageImpl storage) {
        this.storage = storage;
    }

    @Override
    public void add(String name, int count, double weight) {
        storage.add(name, count, weight);
    }

    @Override
    public Integer check() {
        Integer countAll = storage.getAll().stream().map(Product::getCount).reduce(Integer::sum).orElse(0);
        return countAll * 40;
    }
}
