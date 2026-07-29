package optionalClass;

import java.util.List;
import java.util.Optional;

public class CustomerClass {
    static void main(String[] args) {
        Customer c=new Customer("dhruv",11,"9212135697","");
        System.out.println("hello");
        
       // it return always empty
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

         // if value is null it throw NullPointerException otherwise it return value
        Optional<Object> o = Optional.of(c.getId());
        System.out.println(o);

        // if value is null it return empty otherwise it return value
        Optional<String> mailid = Optional.ofNullable(c.getMailid());
        System.out.println(mailid);
    }
}
