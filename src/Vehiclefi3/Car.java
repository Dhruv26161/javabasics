package Vehiclefi3;

public class Car implements Vehicle{
    @Override
    public void name() {
        System.out.println("Ertiga");
    }

    @Override
    public void model() {
        System.out.println("2026");
    }

    @Override
    public void TotalWheel() {
        System.out.println("4 wheeler");
    }
}
