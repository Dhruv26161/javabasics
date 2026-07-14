package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Skip {
    static void main(String[] args) {
        List<String> list= Arrays.asList("Dhruv","Aditya","Sourav");
        List<String> list1 = list.stream().skip(1).toList();
        System.out.println(list1);
    }
}
// isme aap skip me jo bhi number enter karoge utne starting number skip kr dega...