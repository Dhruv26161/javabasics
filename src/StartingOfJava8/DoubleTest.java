package StartingOfJava8;

public class DoubleTest {
    static void main(String[] args) {
        Double d=(n) ->
        {
            System.out.println(n*n);
        };
        d.square(55);
    }
}
