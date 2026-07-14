package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SkipInteger {
    static void main(String[] args) {
        List<Integer>l= Arrays.asList(15,24,49,87,99);
        Integer i = l.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(i);



    }
}
