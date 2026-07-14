package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter {
    static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,40,25,15,75,44);
        l.stream()
                .filter(n -> n > 15)
                        .forEach(System.out::println);
    }
}
