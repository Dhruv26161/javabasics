package abstraction;

public class Car implements Vehicle{
    @Override
    public void name() {
        System.out.println("Ertiga");
    }

    @Override
    public void model() {
        System.out.println("2026 ");
    }

    @Override
    public void speed() {
        System.out.println("car run on 180");
    }

    @Override
    public void manufacturing_Year() {
        System.out.println("December 2025");
    }

    @Override
    public void tank_Capacity() {
        System.out.println("55 Liters");
    }
}
