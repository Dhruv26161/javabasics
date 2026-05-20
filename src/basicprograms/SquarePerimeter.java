package basicprograms;

import java.util.Scanner;

public class SquarePerimeter {
    static void main(String[] args) {
        Scanner perimeter=new Scanner(System.in);
        System.out.println("enter one side");
        int side1= perimeter.nextInt();
        System.out.println("enter second side");
        int side2= perimeter.nextInt();
        int side=side1*side2;
        System.out.println("area is "+side);

    }
}
