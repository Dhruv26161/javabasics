package basicprograms;

public class PrintDivision {
    static void main(String[] args) {
        int hindi=62,english=62,science=62,maths=62,sst=62,total,division;
        double percentage;
        total=hindi+english+science+maths+sst;
        System.out.println("total "+total);
        percentage=(total/500.0)*100;
        System.out.println("percentage is "+percentage);
        if(percentage>=75)
        {
            System.out.println("first division");
        }
        else if (percentage>60 && percentage<75)
        {
            System.out.println("second division");
        }
            else if(percentage>45 && percentage<60)
            {
            System.out.println("third division");
        }
        else if(percentage>33 && percentage<45)
        {
            System.out.println("third division");
        }
        else
        {System.out.println("fail");
        }
    }
}
