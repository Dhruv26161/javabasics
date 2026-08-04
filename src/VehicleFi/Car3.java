package VehicleFi;

import Vehiclefi3.Vehicle;

public class Car3 implements Vehicle {
    @Override
    public void name() {
        System.out.println("Name : Maruti 800");
    }

    @Override
    public void model() {
        System.out.println("Model : top");
    }
    public void manufacruringYear(){
        System.out.println("2009");
    }
    public void mileage(){
        System.out.println("40");
    }
}
