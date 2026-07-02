package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {
    static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("dhruv");
        s.add("sourav");
        System.out.println(s);
        System.out.println(s.remove("sourav"));
        System.out.println(s);
        System.out.println(s.contains("aditya"));
        System.out.println(s.hashCode());
//        Iterator<String> i = s.iterator();
//        while (i.hasNext())
//        {
//            System.out.println(i.next());
//        }
    }
}