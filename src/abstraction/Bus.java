package abstraction;

public class Bus implements Vehicle{
    @Override
    public void name() {
        System.out.println("Ashoka");
    }

    @Override
    public void model() {
        System.out.println("2020");
    }

    @Override
    public void manufacturing_Year() {
        System.out.println("2018");
    }

    @Override
    public void tank_Capacity() {
        System.out.println("120 litre");
    }

    @Override
    public void speed() {
        System.out.println("Top speed 60 KMPH");
    }
}
