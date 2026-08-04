package VehicleFi;

import Vehiclefi3.Vehicle;

public class Car2 implements Vehicle {
    @Override
    public void name() {
        System.out.println("Name : Baleno");
    }

    @Override
    public void model() {
        System.out.println("Model : Base");
    }
    public void manufacruringYear(){
        System.out.println("2018");
    }
    public void mileage(){
        System.out.println("22");
    }
}
