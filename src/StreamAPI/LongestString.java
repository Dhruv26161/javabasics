package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LongestString {
    static void main(String[] args) {
        List<String> s=Arrays.asList("Sourav","Dhruv","Aditya","Mayank" +
                "");
        String string=	s.stream().reduce((a1,a2)->a1.length()>a2.length()?a1:a2)
                        .get();
        System.out.println(string);

    }
}
