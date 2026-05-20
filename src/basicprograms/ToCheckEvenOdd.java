package basicprograms;

import java.util.Scanner;

public class ToCheckEvenOdd {
    static void main(String[] args) {
        Scanner even=new Scanner(System.in);
        System.out.println("enter number");
        int number= even.nextInt();
        if (number>=1)
            System.out.println("positive number");

        else
            System.out.println("negative number");
        even.close();
    }
}
