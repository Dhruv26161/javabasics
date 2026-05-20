package encapsulation;

public class Product {
    private String name;
    private double price;
    private int size;

    public Product(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    public int getSize()
    {
        return size=size;
    }
    public void setSize(int size)

    {
        this.size=size;
    }
}

