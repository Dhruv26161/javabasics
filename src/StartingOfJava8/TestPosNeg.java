package StartingOfJava8;

public class TestPosNeg {
    static void main(String[] args) {
        PosNeg b=(num)->
        {
            if (num>=1)
            {
                System.out.println("positive number");
            }
            else
            {
                System.out.println("negative number");
            }
        };
        b.Check(-1115);
    }
}
