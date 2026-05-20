package basicprograms;

import java.util.Scanner;

public class AgeRev {
    static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("enter age");
        int number= age.nextInt();
        if (number<18)
            System.out.println("restrictions");
        else if (number>=18 && number<=50)
            System.out.println("adult");
        else
            System.out.println("senior citizen");

    }
}
