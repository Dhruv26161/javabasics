package abstractionpractice;

public class Lion implements animal{
    @Override
    public void name() {
        System.out.println(" Name : Sher");
    }

    @Override
    public void breed() {
        System.out.println("Breed : Babbar Sher");
    }

    @Override
    public void birthYear() {
        System.out.println("Birth Year : 2015");
    }

    @Override
    public void age() {
        System.out.println("Age : 11 years");
    }
}
