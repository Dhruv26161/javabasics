package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MapToList {
    static void main(String[] args) {
        List<String> l2= Arrays.asList("dhruv","sourav","aditya");
        List<String> list = l2.stream().map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
