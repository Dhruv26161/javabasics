package abstractionpractice;

public class Cow implements animal{
    @Override
    public void name() {
        System.out.println("name : Sundari");
    }

    @Override
    public void breed() {
        System.out.println("breed : Cow");
    }

    @Override
    public void birthYear() {
        System.out.println("birthYear : 2025");
    }

    @Override
    public void age() {
        System.out.println("Age : 1 year");
    }
}
