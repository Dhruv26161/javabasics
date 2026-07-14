package Employeefi;

public class Ceo implements Interface{
    @Override
    public void work() {
        System.out.println("CEO : Important work" );
    }

    @Override
    public void Attendance() {
        System.out.println("Attendance : Not Compulsory");;
    }
}
