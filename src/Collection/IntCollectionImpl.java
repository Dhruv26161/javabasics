package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntCollectionImpl {
    static void main(String[] args) {
        List<Integer> l2=new ArrayList<>();
        l2.add(250);
        l2.add(2548);
        l2.add(12);
        l2.add(45897);
        System.out.println(l2);
        System.out.println(l2.size());
        Collections.sort(l2);
        System.out.println(l2);
        l2.remove(0);
        System.out.println(l2);
        System.out.println(l2.isEmpty());
        l2.hashCode();
        System.out.println(l2.hashCode());
    }
}
