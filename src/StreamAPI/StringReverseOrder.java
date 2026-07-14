package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringReverseOrder {
    static void main(String[] args) {
        List<String> strings= Arrays.asList("Ankit","Mayank","Dhruv","Sourav","vishal");
        strings.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
