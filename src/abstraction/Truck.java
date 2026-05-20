package abstraction;

public class Truck implements Vehicle{
    @Override
    public void name() {
        System.out.println("Tata");
    }

    @Override
    public void model() {
        System.out.println("2025");
    }

    @Override
    public void manufacturing_Year() {
        System.out.println("2024");
    }

    @Override
    public void tank_Capacity() {
        System.out.println("100 litre");
    }

    @Override
    public void speed() {
        System.out.println("Running on 120");
    }
}
