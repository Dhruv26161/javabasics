package basicprograms;

import java.util.Scanner;

public class ThreeLargestNo {
    static void main(String[] args) {
        //int a,b,c;
        System.out.println("enter the value of a");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        Scanner sc2=new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("enter the value of c");
        Scanner sc3=new Scanner(System.in);
        int c = sc3.nextInt();

        if (a>b && a>c)
        {
            System.out.println("a is greater" +a);
        }


        if (b>a && b>c)
        {
            System.out.println("b is greater" +b);
        }


        if (c>a && c>b)
        {
            System.out.println("c is greater" +c);
        }


    }
}
