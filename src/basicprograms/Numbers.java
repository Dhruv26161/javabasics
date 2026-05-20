package basicprograms;

import java.util.Scanner;

public class Numbers {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("enter first number");
        }
        int num1 = sc.nextInt();
        Scanner cs=new Scanner(System.in);
        {
            System.out.println("enter second number");
        }
        int num2 = cs.nextInt();
        int c=num1+num2;
        System.out.println("answer is "+c);

    }
}
