package StartingOfJava8;

public class Greatest3Test {
    static void main(String[] args) {
        Greatest3 g=(a,b,c) ->
        {
          if (a>b && a>c)
          {
              System.out.println("a is greater");
          }
          else if (b>a && b>c)
          {
              System.out.println("b is greater");
          }
          else {
              System.out.println("c is greater");
          }
        };
        g.max(621,621,621);
    }
}
