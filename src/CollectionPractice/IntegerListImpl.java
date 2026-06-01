package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class IntegerListImpl {
    static void main(String[] args) {
        List<Integer>i=new ArrayList<>();
        i.add(325698);
        i.add(7854);
        i.add(254);
        System.out.println(i);
        System.out.println(i.size());
        System.out.println(i.indexOf(7854));
        i.hashCode();
        System.out.println(i.hashCode());

    }
}
