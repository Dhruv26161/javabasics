package StreamApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListCreation {
    static void main(String[] args) {
        List<String> l= Arrays.asList("Dhruv","Sourav","Mayank","Ankit");
        System.out.println(l);
        l.stream().forEach(System.out::println);
        //System.out.println(l);
        List<String> list = l.stream().skip(2).toList();
        System.out.println(list);
        l.stream().limit(3).forEach(System.out::println);
        List<Integer>a=Arrays.asList(15,35,87,30,88,71,12,55,36,90,87,71,15,16,36);
        List<Integer> list1 = a.stream().sorted().toList();
        System.out.println(list1);
        List<Integer> list2 = a.stream().sorted().distinct().toList();
        Integer i = a.stream().findFirst()
                .get();
        System.out.println(i);
    }
}
