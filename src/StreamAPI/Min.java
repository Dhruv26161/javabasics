package StreamAPI;

import java.util.stream.Stream;

public class Min {
    static void main(String[] args) {
        Integer i= Stream.of(10,20,30,40)
                .min(Integer::compare)
                .get();
        System.out.println(i);

    }
}
