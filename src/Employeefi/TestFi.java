package Employeefi;

public class TestFi {
    static void main(String[] args) {
        Employee e=new Employee();
        Interface.CompanyName();
        e.Attendance();
        e.work();
        Pion p=new Pion();
        p.Attendance();
        p.work();
        Ceo c= new Ceo();
        c.Attendance();
        c.work();
    }
}
