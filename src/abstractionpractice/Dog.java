package abstractionpractice;

public class Dog implements animal{
    @Override
    public void name() {
        System.out.println("Name : Shero");
    }

    @Override
    public void breed() {
        System.out.println("Breed : Pitbull");
    }

    @Override
    public void birthYear() {
        System.out.println("Birth Year : 2021");
    }

    @Override
    public void age() {
        System.out.println("Age 5 year");
    }
}
