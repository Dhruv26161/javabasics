package StartingOfJava8;

public class TestOddEven {
    static void main(String[] args) {
        OddEven a=(n)->{
            if (n%2==0)
            {
                System.out.println("even no");
            }
            else {
                System.out.println("odd no");
            }
        };
        a.check(12);
    }
}
