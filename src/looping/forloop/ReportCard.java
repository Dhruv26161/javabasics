package looping.forloop;

import java.util.Scanner;

public class ReportCard {
    static void main(String[] args) {
        int total;
        Scanner hinde=new Scanner(System.in);
        System.out.println("enter hindi marks");
        int h = hinde.nextInt();

        Scanner eng=new Scanner(System.in);
        System.out.println("enter eng marks");
         int e =eng.nextInt();

        Scanner math=new Scanner(System.in);
        System.out.println("enter maths marks");
        int m = math.nextInt();

        Scanner sci=new Scanner(System.in);
        System.out.println("enter science marks");
        int s = sci.nextInt();

        Scanner ss=new Scanner(System.in);
        System.out.println("enter sst marks");
        int ssth = ss.nextInt();

        total=h+e+m+s+ssth;
        double percentage=total/500.0*100;
        if (percentage>=75)
        {
            System.out.println("first division");
        }

        else if (percentage>60 && percentage<75)
        {
            System.out.println("second division");
        }

        else if (percentage>45 && percentage<60)
        {
            System.out.println("third division");
        }

        else if (percentage>33 && percentage<45)
        {
            System.out.println("fourth division");
        }

        else
        {
            System.out.println("student fail");
        }
    }
}
