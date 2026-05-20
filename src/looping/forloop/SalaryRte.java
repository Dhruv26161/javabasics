package looping.forloop;

import java.util.Scanner;

public class SalaryRte {
    static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter your salary");
        int salary = ss.nextInt();
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

        //System.out.println("ur sslary is "+salary);
    }
}
