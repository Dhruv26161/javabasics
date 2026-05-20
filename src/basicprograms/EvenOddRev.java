package basicprograms;

import java.util.Scanner;

public class EvenOddRev {
    static void main(String[] args) {
        Scanner even=new Scanner(System.in);
        System.out.println("enter you number");
        int number=even.nextInt();
        if(number%2==0)
            System.out.println("even number");
        else
            System.out.println("odd number");
        even.close();
    }
}
