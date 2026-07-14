package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    static void main(String[] args) {
        List<Integer> i= Arrays.asList(45,73,12,95,75,13,96,95,13);
        i.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
//remove duplicate elements...