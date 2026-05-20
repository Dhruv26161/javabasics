package inheritance;

public class Bus extends Vehicles{
    private double length;
    private int gearbox;

    public Bus(String name, double price, int manufacturingYear, double length, int gearbox) {
        super(name, price, manufacturingYear);
        this.length = length;
        this.gearbox = gearbox;
    }

    @Override
    public void displayDetail()
    {
        super.displayDetail();
        System.out.println("Length of the bus is :"+length);
        System.out.println("Total number of gear is :"+gearbox);
    }
}
