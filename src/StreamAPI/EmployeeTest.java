//package StreamAPI;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class EmployeeTest {
//    static void main(String[] args) {
//        List<Employee> e= Arrays.asList(
//                new Employee(1,"Dhruv","Development",50000),
//                new Employee(1,"Saurav","Devops",40000),
//                new Employee(1,"Mayank","Data Science",25000),
//                new Employee(1,"Ankit","AI",65000));
//        new Employee(1,"Mayank","Data Science",25000),
//        List<Employee> list = e.stream()
//        .filter(x->x.salary>50000)
//  .sorted(Comparator.comparingDouble(Employee::getSalary))
//                .collect(Collectors.toList());
//        System.out.println(list);
//                .distinct().toList();
//        System.out.println(list);
//    }
//}
