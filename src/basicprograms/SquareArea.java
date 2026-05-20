package basicprograms;

import java.util.Scanner;

public class SquareArea {
    static void main(String[] args) {
        Scanner square=new Scanner(System.in);
        System.out.println("enter side");
        int side=square.nextInt();
        int area=4*side;
        System.out.println("area of square is "+area);
    }
}
