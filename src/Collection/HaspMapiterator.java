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
        str.forEach();
    }
}
