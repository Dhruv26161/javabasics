package inheritance;

public class Truck extends Vehicles{
    private String company;
    private boolean hasHMVLicense;

    public Truck(String name, double price, int manufacturingYear,
                 String company, boolean hasHMVLicense)
    {
        super(name, price, manufacturingYear);
        this.company = company;
        this.hasHMVLicense = hasHMVLicense;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Company name is :"+company);
        System.out.println("is your document ready :"+hasHMVLicense);
    }
}
