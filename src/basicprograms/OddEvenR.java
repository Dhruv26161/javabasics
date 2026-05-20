package basicprograms;

import java.util.Scanner;

public class OddEvenR {
    static void main(String[] args) {
        int i;
        System.out.println("enter the value of a");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
        System.out.println(num);
    }
}
