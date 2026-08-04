package Vehiclefi3;

public interface myinterface {
    void start();
    static void horn(){
        System.out.println("All vehicle has horn");
    }
    default void fueltype()
    {
        System.out.println("every vehicle use fuel to run");
    }

}
