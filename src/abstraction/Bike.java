package abstraction;

public class Bike implements Vehicle{
    @Override
    public void name() {
        System.out.println("Jupiter");

    }

    @Override
    public void model() {
        System.out.println("2026");

    }

    @Override
    public void manufacturing_Year() {
        System.out.println("March 2026");

    }

    @Override
    public void tank_Capacity() {
        System.out.println("5.5 litre");

    }

    @Override
    public void speed() {
        System.out.println("110");
    }
}
