package inheritance;

public class Car extends Vehicles{
    private int seats;
    private boolean hasPrivate;

    public Car(String name, double price, int manufacturingYear,
               int seats, boolean hasPrivate)
    {
        super(name, price, manufacturingYear);
        this.seats = seats;
        this.hasPrivate = hasPrivate;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Total seats are :"+seats);
        System.out.println("Select your car type :"+hasPrivate);
    }
}
