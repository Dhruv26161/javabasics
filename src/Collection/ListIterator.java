package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("Dhruv");
        li.add("kartik");
        li.add("Rakesh");
        System.out.println(li);
        Iterator<String> str=li.iterator();
        while (str.hasNext())
        {
            System.out.println(str.next());
        }

    }
}
