package Collection;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    static void main(String[] args) {
        Map<String,String> st=new HashMap<>();
        st.put("Name","Sourav");
        st.put("Salary","20000");
        st.put("Experience","2+");
        System.out.println(st);
        for (String l:st.keySet())
        {
            System.out.println(l);
        }
        for (String h:st.values())
        {
            System.out.println(h);
        }
    }
}
