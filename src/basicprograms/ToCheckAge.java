package basicprograms;

public class ToCheckAge {
    static void main(String[] args) {
        int age=18;
//        if (num<18)
//            System.out.println("you are under restrictions");
//
//        if (num>18 || num>=25)
//            System.out.println("you are an student");
//
//        else if (num>26 || num>=50)
//            System.out.println("you needs to be strong");
//
//        else
//            System.out.println("senior citizens ");
        if(age<18)
        {
            System.out.println("You are under age");
        }
        else if(age>=18 && age<=50)
        {
            System.out.println("You are Adult");
        }

        else
        {
            System.out.println("Senior Citizon");
        }

    }
}
