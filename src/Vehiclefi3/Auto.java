package Vehiclefi3;

public class Auto implements Vehicle{
    @Override
    public void name() {
        System.out.println("Tata");
    }

    @Override
    public void model() {
        System.out.println("2022");
    }

    @Override
    public void TotalWheel() {
        System.out.println("3 wheeler");
    }
}
