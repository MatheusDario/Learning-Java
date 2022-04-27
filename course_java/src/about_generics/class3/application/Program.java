package about_generics.class3.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "61992887722");

        cookies.remove("email");
        cookies.put("phone", "61993712250");

        System.out.println("Contains 'phone' key ? " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
