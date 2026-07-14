package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamIterator {
    static void main(String[] args) {
        List<Integer>i= Arrays.asList(2,58,45,35,78,91);
        i.stream().map(Integer::highestOneBit).forEach(System.out::println);
    }
}

