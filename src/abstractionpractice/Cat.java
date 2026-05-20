package abstractionpractice;

public class Cat implements  animal{
    @Override
    public void name() {
        System.out.println("Name : Anni");
    }

    @Override
    public void breed() {
        System.out.println("Breed : Persian");
    }

    @Override
    public void birthYear() {
        System.out.println("Birth Year : 2020");
    }

    @Override
    public void age() {
        System.out.println("Age : 6 year");
    }
}
