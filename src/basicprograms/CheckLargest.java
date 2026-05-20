package basicprograms;

public class CheckLargest {

    static void main(String[] args) {
        int a=30,b=20,c=60;
        if (a>b && a>c)
            System.out.println("a is greatest");
        else if (b>a && b>c)
            System.out.println("b is greatest");
        else
            System.out.println("c is greatest");
    }

}
