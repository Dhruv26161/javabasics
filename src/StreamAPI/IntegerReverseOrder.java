package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntegerReverseOrder {
    static void main(String[] args) {
        List<Integer>integers= Arrays.asList(15,51,36,75,98,12,77,30);
        List<Integer> list = integers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list);
    }
}
