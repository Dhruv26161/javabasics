package Employeefi;

public class Pion implements Interface {

    @Override
    public void work() {
        System.out.println("Only cleaning work for the pion");
    }

    @Override
    public void Attendance() {
        System.out.println("Pion : Attendance Compulsory");
    }
}
