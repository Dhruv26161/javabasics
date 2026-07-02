package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListMeKuch {
    static void main(String[] args) {
        List<String> fruits=new ArrayList<>();

                // 1. add(E element)
                fruits.add("Apple");
                fruits.add("Banana");
                System.out.println(fruits);

                fruits.add(1, "Mango");

                System.out.println(fruits.get(0));

                fruits.set(1, "Orange");

                fruits.remove(1);

                fruits.remove("Banana");

                System.out.println(fruits.contains("Apple"));

                System.out.println("8. size(): " + fruits.size());

                System.out.println("9. isEmpty(): " + fruits.isEmpty());

                fruits.add("kiwi");
                System.out.println(fruits);

                System.out.println(fruits.indexOf("Kiwi"));

                fruits.add("Apple");
                System.out.println(fruits.lastIndexOf("Apple"));

                fruits.clear();
                System.out.println(fruits);

                fruits.hashCode();
        System.out.println(fruits);
    }
}
