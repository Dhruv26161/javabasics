package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {
    static void main(String[] args) {
        List<String>l=new ArrayList<>();
        l.add("Dhruv");
        l.add("Mayank");
        l.add("vikas");
        System.out.println(l);
        l.remove("vikas");
        System.out.println(l);
        l.hashCode();
        System.out.println(l.hashCode());
        System.out.println(l.contains("gyan"));
        System.out.println(l.isEmpty());
        //l.clear();
        System.out.println(l.isEmpty());
        l.add("vijemdra");
        l.add("Aditya");
        l.add("saloni");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.indexOf("Aditya"));
    }
}
