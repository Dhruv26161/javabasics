package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TreeIterator {
    static void main(String[] args) {
        Set<Integer>a=new HashSet<>();
        a.add(258);
        a.add(12548);
        a.add(3697);
        a.add(4587);
        System.out.println(a);
        Iterator<Integer> b =a.iterator();
        while (b.hasNext())
        {
            System.out.println(b.next());
        }
    }
}
