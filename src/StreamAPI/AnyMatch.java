package StreamAPI;

import java.util.stream.Stream;

public class AnyMatch {
    static void main(String[] args) {
        boolean result= Stream.of(15,37,9,85)
                .anyMatch(n-> n>10);
        System.out.println(result);
    }
}
