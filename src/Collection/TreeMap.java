package Collection;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    static void main(String[] args) {
        Map<String,Integer> s=new HashMap<>();
        s.put("Name",4808);
        s.put("Hobbies",45878);
        s.put("DOB",26082004);
        System.out.println(s);
        for (String a:s.keySet())
        {
            System.out.println(a);
        }
        for (Integer i:s.values())
        {
            System.out.println(i);
        }
    }
}
