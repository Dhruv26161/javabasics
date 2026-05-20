package looping.forloop;

import java.util.Scanner;

public class AgeRte {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");
        int age = sc.nextInt();
        if (age<18)
        {
            System.out.println("you are under some restrictions");
        }

        else if (age>=18 && age<25)
        {
            System.out.println("maybe you are an student");
        }

        else if (age>=25 && age<60)
        {
            System.out.println("you are an earning employee");
        }

        else if (age>=60)
        {
            System.out.println("maybe you are an senior citizen");
        }
    }
}
