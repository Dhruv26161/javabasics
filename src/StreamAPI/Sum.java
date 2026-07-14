package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Sum {
    static void main(String[] args) {
        List<Integer> ab= Arrays.asList(48,38,91,8,97);;
        Integer a= ab.stream()
                .reduce(0,Integer::sum);
        System.out.println(a);
    }
}
