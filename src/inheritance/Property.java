package inheritance;

import javax.xml.stream.Location;

public class Property {
    private String location;
    private double price;
    private int size;
public Property(String location,double price,int size)
{
  this.location=location;
  this.price=price;
  this.size=size;
}
public String getLocation()
{
return location;
}
public double getPrice()
{
    return price;
}
public int getSize()
{
    return size;
}
public void displayDetails()
{
    System.out.println("location is : "+location);
    System.out.println("Price is : "+price);
    System.out.println("Size is : "+size);
}
}
