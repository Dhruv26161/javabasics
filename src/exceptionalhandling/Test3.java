package exceptionalhandling;

public class Test3 {
    static void main(String[] args) {
        try{
            int a=100/0;

        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
