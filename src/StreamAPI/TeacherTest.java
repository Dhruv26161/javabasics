package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TeacherTest {
    static void main(String[] args) {
        List<Teachers> strings= Arrays.asList(
                new Teachers("vijendra",10,50000),
                new Teachers("priya",18,22000),
                new Teachers("deepak",10,63000),
                new Teachers("harendra",16,88000),
                new Teachers("gajendra",94,42000),
                new Teachers("shalu",79,31000),
                new Teachers("nandini",60,26000),
                new Teachers("deepak",10,63000),
                new Teachers("harendra",16,88000),
                new Teachers("deepak",10,63000),
                new Teachers("harendra",16,88000)
                );
        strings.stream()//.findFirst()
                .distinct()
                .skip(3).forEach(System.out::println);
                //.get();
        //System.out.println(teachers);
    }
}
