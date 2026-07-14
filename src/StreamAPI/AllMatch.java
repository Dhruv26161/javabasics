package StreamAPI;

import java.util.stream.Stream;

public class AllMatch {
    static void main(String[] args) {
        boolean b= Stream.of(15,75,9,28)
                .allMatch(n-> n<50);
        System.out.println(b);
    }
}
