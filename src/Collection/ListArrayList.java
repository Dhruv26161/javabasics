package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayList {
    static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Dhruv");
        li.add("Aditya");
        System.out.println(li);
        Iterator<String> it=li.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
