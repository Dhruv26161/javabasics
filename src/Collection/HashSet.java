package Collection;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    static void main(String[] args) {
        Set<Integer>s=new java.util.HashSet<>();
        s.add(45);
        s.add(25);
        s.add(458);
        System.out.println(s);
        Iterator<Integer>it=s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
