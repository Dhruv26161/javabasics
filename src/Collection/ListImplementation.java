package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    static void main() {
        List<String> l =new ArrayList<>();
        l.add("Dhruv");
        l.add("Aditya");
        l.add("Sourav");
        l.add("Mayank");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("Prince"));
        System.out.println(l.get(2));
        List<String> l3=new ArrayList<>();
        l3.add("Vikas");
        l3.add("Gyan");
        l3.add("Kartik");
        l.addAll(l3);
        System.out.println(l);
        l.iterator();
        System.out.println(l);
    }
}
