package VehicleFi;

import Vehiclefi3.Vehicle;

public class Car1 implements Vehicle {
    @Override
    public void name() {
        {
            System.out.println("Car Name : Ertiga");
        }
    }
    @Override
    public void model() {
        {
            System.out.println("Model : Top");
        }
    }
    public void manufacturingYear(){
        System.out.println("Manufacturing Year : December 2025");
    }
    public void mileage(){
        System.out.println("25 kmpl");
    }
}
