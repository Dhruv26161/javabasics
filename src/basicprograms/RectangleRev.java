package basicprograms;

import java.util.Scanner;

public class RectangleRev {
    static void main(String[] args) {
        Scanner rectangle=new Scanner(System.in);
        System.out.println("enter length");
        int length=rectangle.nextInt();
        System.out.println("enter breath");
        int breath=rectangle.nextInt();
        System.out.println("enter height");
        int height=rectangle.nextInt();
        int area = 2 * length + breath * height;
        System.out.println("area is "+area);
        rectangle.close();
    }
}
