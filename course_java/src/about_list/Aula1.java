package about_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());

        for (String pessoas : list) { // Imprimindo os itens da lista
            System.out.println(pessoas);
        }
        System.out.println("---------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); // Removendo da lista quem comeca com a letra "M"
        for (String pessoas : list) {
            System.out.println(pessoas);
        }
        System.out.println("---------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Como verificar o indece e se esta na lista
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Como verificar o indece e se esta na lista
        System.out.println("---------------------------");

        List<String> filterA = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Filtra quem comeca com "A"
        for (String pessoas : filterA) {
            System.out.println(pessoas);
        }

        System.out.println("---------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Pega o primeiro nome que comca com "A"
        System.out.println(name);
    }
}
