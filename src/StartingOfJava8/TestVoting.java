package StartingOfJava8;

public class TestVoting {
    static void main(String[] args) {
        Check18 c=(age) ->
        {
            if (age<18)
            {
                System.out.println("not valid for the voting");
            }
            else
            {
                System.out.println("valid for the voting");
            }
        };
        c.Voting(44);
    }
}
