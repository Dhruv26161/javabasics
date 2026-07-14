package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ListImp {
    static void main(String[] args) {
        List<Integer> l= Arrays.asList(25,27,95,35,48,34,21);
        List<Integer> l1= l.stream().distinct().toList();
        System.out.println(l1);

    }
}
