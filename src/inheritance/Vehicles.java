package inheritance;

public class Vehicles {
    private String name;
    private double price;
    private int manufacturingYear;

    public Vehicles(String name, double price, int manufacturingYear)
    {
        this.name=name;
        this.price=price;
        this.manufacturingYear=manufacturingYear;
    }
    public String getName
            (){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getManufacturingYear()
    {
        return manufacturingYear;
    }


    public void displayDetail()
    {
        System.out.println("vehicle name is :"+name);
        System.out.println("Price is :"+price);
        System.out.println("Manufacturing year is  :"+manufacturingYear);
    }
}
