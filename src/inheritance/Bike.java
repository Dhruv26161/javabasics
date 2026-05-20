package inheritance;

public class Bike extends Vehicles{
    private int tankcapacity;
    private boolean hasElectric;
    private double range;

    public Bike(String name, double price, int manufacturingYear,
                int tankcapacity, boolean hasElectric, double range)
    {
        super(name, price, manufacturingYear);
        this.tankcapacity = tankcapacity;
        this.hasElectric = hasElectric;
        this.range = range;
    }

    {
        super.displayDetail();
        System.out.println("Total tank capacity is :"+tankcapacity);
        System.out.println("Select the valid answer :"+hasElectric);
        System.out.println("Maximum range within a single charge :"+range);
    }
}
