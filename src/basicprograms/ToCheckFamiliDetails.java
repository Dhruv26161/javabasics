package basicprograms;

public class ToCheckFamiliDetails {
    static void main(String[] args) {
        char you=22;
        if (you <= 18)
        {
            System.out.println("you are non adult");
        }
        else if (you > 18 && you <= 25)
        {
            System.out.println("you are an student");
        }
        else if (you > 25 && you <= 50)
        {
            System.out.println("you are an employee");
        }
        else
        {
            System.out.println(" you are an senior citizen");
        }
    }
}