package polymorphism;

public class TestVehicle {
    static void main(String[] args) {
        Car car=new Car();
        Bike bike=new Bike();
        Bus bus=new Bus();
        Truck truck=new Truck();
        car.sound();
        bike.sound();
        bus.sound();
        truck.sound();

    }
}
