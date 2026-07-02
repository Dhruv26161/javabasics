package StartingOfJava8;

public class GreatestTest {
    static void main(String[] args) {
        Greatest g=(int a,int b) ->
        {
            if(a>b)
            {
                System.out.println("a is greater");
            }
            else
            {
                System.out.println("b is greater");
            }
        };
        g.biggest(44,25);
    }
}
