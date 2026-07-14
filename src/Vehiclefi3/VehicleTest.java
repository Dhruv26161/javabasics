package Vehiclefi3;

public class VehicleTest {
    static void main(String[] args) {
        Car c=new Car();
        Vehicle.Headlight();
        c.name();
        c.model();
        c.TotalWheel();

        Bus b=new Bus();
        Vehicle.Headlight();
        b.name();
        b.model();
        b.TotalWheel();

        Auto a=new Auto();
        Vehicle.Headlight();
        a.name();
        a.model();
        a.TotalWheel();

        Scooty s=new Scooty();
        Vehicle.Headlight();
        s.name();
        s.model();
        s.TotalWheel();
    }
}
