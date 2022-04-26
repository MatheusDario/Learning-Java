package about_generics.class2.application;

import about_generics.class2.entities.Product;
import about_generics.class2.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String path = "/home/matheus/Documents/Files-course-java-udemy/products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String [] filds = line.split(",");
                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
