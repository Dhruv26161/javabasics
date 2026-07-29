package optionalClass;

import java.util.Optional;

public class StudentStaticMethodsTest {
    static void main(String[] args) {
        StudentStaticMethods s=
                new StudentStaticMethods(null,13,"921");
        System.out.println(s);

    //is present
        Optional<String> name = Optional.ofNullable(s.getName());
        if (name.isPresent())
        {
            System.out.println("student found");
        }
        else {
            System.out.println("student not found");
        }

        //is empty
        // if email is present it return nothing otherwise pass given msg
        Optional<String> sr=Optional.ofNullable(s.getPhonenumber());
        if (sr.isEmpty())
        {
            System.out.println("returns nothing");
        }

        // get()
        // if value is present it return value otherwise it return-NoSuchElementException
        Optional<Integer> rollno = Optional.ofNullable(s.getRollno());
        System.out.println(rollno.get());

        //  orElse()
        // if value is present it return value otherwise it return default value

        Optional<String> sName = Optional.ofNullable(s.getName());
        String s1 = sName.orElse("xyz@gmail.com");
        System.out.println(s1);

        // orElseThrow()
        // if value is present it return value otherwise it throw Exception

        Optional<String> ot= Optional.ofNullable(s.getPhonenumber());
        String i = ot.orElseThrow(() -> new RuntimeException("phone number not found"));
        System.out.println("email not found");

        // equals()
        Optional <String>sa=Optional.of("java");
        Optional <String>ss=Optional.of("java");
        System.out.println(sa.equals(ss));
    }
}
