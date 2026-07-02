package exceptionalhandling;

public class ToPrintString {
    static void main(String[] args) {
        try{
            int a= 100/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
