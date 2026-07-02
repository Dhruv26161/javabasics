package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {
    static void main(String[] args) {
        List<String> l=new LinkedList<>();
        l.add("Mayank");
        l.add("vishal");
        l.add("Sourav");
        System.out.println(l);
        Iterator<String> itr=l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
