package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    static void main(String[] args) {
        Set<String> st=new HashSet<>();
        st.add("Sourav");
        st.add("Saurabh");
        st.add("Sourabh");
        System.out.println(st);
        Iterator<String> sti=st.iterator();
        while (sti.hasNext())
        {
            System.out.println(sti.next());
        }
    }
}
