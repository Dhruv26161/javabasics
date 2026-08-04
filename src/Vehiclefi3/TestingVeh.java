package Vehiclefi3;

public class TestingVeh {
    static void main(String[] args) {
        myinterface.horn();
        Buss b = new Buss();
        b.start();
        b.fueltype();

        Truck t =new Truck();
        t.start();
        t.fueltype();

        Scootyy s=new Scootyy();
        s.start();
        s.fueltype();
    }
}
