package basicprograms.whileloop;

public class FabonnaciSeries {
    static void main(String[] args) {
        int a=0,b=1,c,num=10;
        System.out.print(a);
        System.out.print(b);
        for(int i=2;i<=num;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
    }
}
