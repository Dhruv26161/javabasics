package basicprograms;

import java.util.Scanner;

public class SwappingRev {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value a");
        int a = scanner.nextInt();
        System.out.println("enter value b");
        int b = scanner.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("value a is "+a);
        System.out.println("value b is "+b);
        scanner.close();

    }
}
