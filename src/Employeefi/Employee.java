package Employeefi;

public class Employee implements Interface{
    @Override
    public void work()
    {
        System.out.println("All employees are working");
    }

    @Override
    public void Attendance() {
        System.out.println("Attendance Compulsory");
    }
}
