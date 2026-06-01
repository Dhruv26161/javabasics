package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetImplement {
    static void main(String[] args) {
        Set <String>s=new HashSet<>();
        s.add("Sourav");
        s.add("Aditya");
        s.add("Dhruv");
        s.add("Ankit");
        s.add("Prince");
        System.out.println(s);
        System.out.println(s.size());
        //s.contains("Dhruv");
        System.out.println(s.contains("Dhruv"));
        System.out.println(s.isEmpty());
        //s.clear();
        s.remove("Ankit");
        System.out.println(s);

    }
}
