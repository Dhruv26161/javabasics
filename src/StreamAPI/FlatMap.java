package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    static void main(String[] args) {
        List<List<String>> list= Arrays.asList(
                Arrays.asList("Dhruv","Ankit","Btech"),
                Arrays.asList("mayank","prince"),
                        Arrays.asList("vishal","Aditya"));
        List<String> list1 = list.stream().flatMap(List::stream).toList();
        System.out.println(list1);


    }
}
