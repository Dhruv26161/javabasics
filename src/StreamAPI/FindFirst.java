package StreamAPI;

import java.util.stream.Stream;

public class FindFirst {
    static void main(String[] args) {
        String s= Stream.of("Dhruv","Aditya","Sourav")
                .findFirst()
                .get();
        System.out.println(s);
    }
}
