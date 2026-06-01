package CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
    static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("Dhruv");
        s.add("Mayank");
        s.add("vikas");
        System.out.println(s);
        s.remove("vikas");
        System.out.println(s);
        s.hashCode();
        System.out.println(s.hashCode());
        System.out.println(s.contains("gyan"));
        System.out.println(s.isEmpty());
        //l.clear();
        System.out.println(s.isEmpty());
        s.add("vij");
        s.add("Adi");
        s.add("prince");
        System.out.println(s);
        System.out.println(s.size());
        //System.out.println(sindexOf("Aditya"));

    }
}
