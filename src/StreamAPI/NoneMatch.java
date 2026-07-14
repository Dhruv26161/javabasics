package StreamAPI;

import java.util.stream.Stream;

public class NoneMatch {
    static void main(String[] args) {
        boolean a= Stream.of(45,67,88,90,79)
                .noneMatch(n-> n>40);
        System.out.println(a);
    }
}
