package about_pfunctional_exlambda.function.application;

import about_pfunctional_exlambda.predicate.entities.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println("--------------");
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println("--------------");

        List<Integer> list1 = Arrays.asList(3, 4, 5, 10, 7);

        List<Integer> newList = list1.stream()
                .filter(x -> x % 2 ==0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);



    }
}
