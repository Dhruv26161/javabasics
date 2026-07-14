package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Minimum {
    static void main(String[] args) {
        List<Integer> i= Arrays.asList(10,65,75,48,62,90,88);
        List<Integer> list = i.stream()
                .min(Integer::compare)
                .stream().toList();
        System.out.println(list);
    }
}
