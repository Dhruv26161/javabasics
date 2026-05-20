package basicprograms;
public class ToCheckEmployeeSalary {
    static void main(String[] args) {

    int salary=40000;
        if (salary>=100000)
    {
        System.out.println("yor are an grade A employee ");
    }
        else if (salary>=75000 && salary<100000)
    {
        System.out.println("yor are an grade B employee ");
    }
        else if (salary>=50000 && salary<75000)
    {
        System.out.println("yor are an grade C employee ");
    }
        else if (salary>=20000 && salary<50000)
    {
        System.out.println("yor are an grade d employee ");
    }
        else
    {
        System.out.println("you are an labour");
    }
}
}
