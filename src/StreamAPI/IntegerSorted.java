package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class IntegerSorted {
    static void main(String[] args) {
        List<Integer> integers=Arrays.asList(10,58,42,31,11,45,39,89);
        List<Integer> list = integers.stream()
                .sorted()
                .toList();
        System.out.println(list);
    }
}
