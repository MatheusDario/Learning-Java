package about_generics.class1.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();


    public void addValue(T value) {
        list.add(value);
    }

    public void print() {
        System.out.print("Values: [");
        if(!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }

    public T first() {
        if(list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
}
