package basicprograms;

import java.util.Scanner;

public class ToAddTwoNumber {
    static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("enter second number");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double div = num1 / num2;
        double mul = num1 * num2;
        double sub = num1 - num2;

        System.out.println("sum is "+sum);
        System.out.println("mul is  "+mul);
        System.out.println("sub is   "+sub);
        System.out.println("division is  "+div);
        scanner.close();
    }
}
