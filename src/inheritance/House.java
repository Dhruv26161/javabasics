package inheritance;

public class House extends Property {
    private int rooms;
    private boolean hasGarden;
    public House(String location, int size, double price,int
            rooms,boolean hasGarden)
    {
        super(location,price,size);
        this.rooms=rooms;
        this.hasGarden=hasGarden;
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("total Rooms :"+rooms);
        System.out.println("Garden available :"+hasGarden);
    }

}
