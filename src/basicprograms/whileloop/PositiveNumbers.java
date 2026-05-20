package basicprograms.whileloop;

import java.util.Scanner;

public class PositiveNumbers {
    static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int num = sc.nextInt();
        //while(num>0)
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.println("sum= " + sum);
        }
    }
}

//                int sum = 0;
//
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter a number:");
//                int num = sc.nextInt();
//
//                for (int i = 1; i <= num; i++) {
//                    sum = sum + i;
//                }
//
//                System.out.println("Sum = " + sum);
//            }
//        }

