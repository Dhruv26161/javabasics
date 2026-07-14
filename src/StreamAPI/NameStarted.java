package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStarted {
    static void main(String[] args) {
        List<String>s= Arrays.asList("Dhruv","Sourav","Aditya","Mayank");
        List<String> d = s.stream()
                .filter(name -> name.startsWith("D")).collect(Collectors.toList());
        System.out.println(d);
    }
}
