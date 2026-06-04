package Collection;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    static void main(String[] args) {
        Set<Integer>h=new java.util.LinkedHashSet<>();
        h.add(4587);
        h.add(12365);
        h.add(753158);
        System.out.println(h);
        Iterator<Integer>i=h.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
