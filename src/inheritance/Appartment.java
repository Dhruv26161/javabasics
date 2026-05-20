package inheritance;

public class Appartment extends Property{
    //Integer size;
    Boolean parking;
    int floor;

    public Appartment(String Location, double price, int Size
            , Boolean parking, int floor)
    {
        super(Location, price, Size);
        //this.size = size;
        this.parking = parking;
        this.floor =floor;
    }
    public void displayDetail()
    {
        //System.out.println("size is :"+size);
        System.out.println("parking space :"+parking);
        System.out.println("price is negotiable :"+floor);
    }
}

