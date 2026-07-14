package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StringSortedByIterator {
    static void main(String[] args) {
        List<String> str= Arrays.asList("Dhruv","Aditya","Sourav");
        str.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
