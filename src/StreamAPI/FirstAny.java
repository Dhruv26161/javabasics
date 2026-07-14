package StreamAPI;

import java.util.stream.Stream;

public class FirstAny {
    static void main(String[] args) {
        Integer i= Stream.of(10,35,7,48,35,76)
                .findAny()
                .get();
        System.out.println(i);
    }
}
