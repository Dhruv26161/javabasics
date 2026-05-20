package looping.forloop;

import java.util.Scanner;

public class LoopFourth {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the number");
//
//        int num = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num+"*"+i+"="+(num * i));
//        }

        int  a=0,b=1,num=10,c;

        System.out.print(a);
        System.out.print(b);
        for (int i=2;i<=num;i++)
        {
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;

        }

    }
    }

