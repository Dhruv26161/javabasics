package StreamAPI;

import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.List;

public class StudentTest {
    static void main(String[] args) {
        List<Student>s= Arrays.asList(
                new Student("pushpa",1,80000),
                new Student("dhruv",2,120000),
                new Student("prashant",3,110000),
                new Student("sourav",4,60000),
                new Student("pushkar",5,210000),
                new Student("pranjal",6,310254),
                new Student("priya",7,450000),
                new Student("pankaj",8,87000)
        );
         s.stream()
                        .filter(x->x.salary>100000 && x.getName().startsWith("p"))
                 .forEach(System.out::println);
    }
}
