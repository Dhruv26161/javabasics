package Collection;

import java.util.HashMap;
import java.util.Map;

public class HaspMapiterator {
    static void main(String[] args) {
        Map<String,String> str=new HashMap<>();
        str.put("Name","dhruv");
        str.put("department","BCA");
        str.put("College","Unknown");
        System.out.println(str);
        for (String m:str.keySet())
        {
            System.out.println(m);
        }
        for (String m1: str.values())
        {
            System.out.println(m1);
        }
    }
}
