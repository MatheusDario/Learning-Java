package about_generics.class3.application;

import about_generics.class3.entities.Product;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Notebook", 1220.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("TV", 900.0);

        System.out.println("Contains 'ps' key " + stock.containsKey(ps));

        for(Product key : stock.keySet()) {
            System.out.println(key.getName() + ": " + key.getPrice() + " and have: " + stock.get(key));
        }
    }
}
