package StreamAPI;

import java.util.stream.Stream;

public class Max {
    static void main(String[] args) {
        Integer m= Stream.of(25,45,15,95,78)
                .max(Integer::compare)
                .get();
        System.out.println(m);
    }
}
