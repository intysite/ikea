import org.example.StorageImpl;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StorageImpl storage = new StorageImpl();
        ShopImpl shop = new ShopImpl(storage);
        while (true) {
            String input = console.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (input.equalsIgnoreCase("check")) {
                System.out.println(shop.check());
                continue;
            }

            String[] split = input.split(",");
            if (split.length != 3) {
                System.out.println("введено менее 3 параметров");
                continue;
            }

            String name = split[0];
            int count = Integer.parseInt(split[1]);
            double weight = Double.parseDouble(split[2]);
            shop.add(name, count, weight);
        }
    }
}
