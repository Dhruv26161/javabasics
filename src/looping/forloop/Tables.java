package looping.forloop;

import java.util.Scanner;

public class Tables {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println((n+"*"+i)+"="+n*i);
        }
    }
}
