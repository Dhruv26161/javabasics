package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Limit {
    static void main(String[] args) {
        List<String>s= Arrays.asList("Dhruv","Aditya","Sourav","vishal","Aditya","Dhruv");
        List<String> list = s.stream()
                .limit(3)
                .toList();
        System.out.println(list);
    }
}
// used to print only starting limited elements...