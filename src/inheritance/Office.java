package inheritance;

public class Office extends Property{
    int department;
    boolean hasOvertime;
    double rent;

    public Office(String location, double price, int size,
                  int department, boolean hasOvertime, double rent)
    {
        super(location, price, size);
        this.department=department;
        this.hasOvertime = hasOvertime;
        this.rent=rent;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Here are total number of department :"+department);
        System.out.println("overtime available :"+hasOvertime);
        System.out.println("rent negotiable :"+rent);
    }
}
