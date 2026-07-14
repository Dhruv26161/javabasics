package Vehiclefi3;

public class Bus implements Vehicle{
    @Override
    public void name() {
        System.out.println("Ashok Leyland");
    }

    @Override
    public void model() {
        System.out.println("2018");
    }

    @Override
    public void TotalWheel() {
        System.out.println("4 wheeler");
    }
}
