package polymorphism;

public class TestChildren {
    static void main() {
        FirstChildren first=new FirstChildren();
        SecondChildren second=new SecondChildren();
        ThirdChildren third=new ThirdChildren();
        first.behaviour();
        second.behaviour();
        third.behaviour();
    }
}
