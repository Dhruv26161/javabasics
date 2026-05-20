package inheritance;

public class TestBus {
    static void main(String[] args) {
        Bus bus= new Bus("Marcopolo",750000,
                2004,144,6);
        bus.displayDetail();

        Truck truck=new Truck("Assipire",125000,2010,
                "Ashok",false);
        truck.displayDetail();

        Car c=new Car("Ertiga",1250000,2026,
                8,false);
        c.displayDetail();

        Bike b=new Bike("honda",100000,2026,
                5,false,500);
        b.displayDetail();

    }
}
