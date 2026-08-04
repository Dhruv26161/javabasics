package Vehiclefi3;

public class Buss implements myinterface{
    @Override
    public void start() {
        System.out.println("vehicle start");
    }

    @Override
    public void fueltype() {
        System.out.println("this is EV vehicle");
    }
}
