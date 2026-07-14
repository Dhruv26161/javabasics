package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeconHighest {
    static void main(String[] args) {
        List<Integer> list1= Arrays.asList(4,8,2,17,29,4);
        List<Integer>List2= Arrays.asList(40,4,8,38,76);
        List<Integer> merged = Stream.concat(list1.stream(),List2.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(merged);
    }
}
