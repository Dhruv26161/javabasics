package StreamAPI;

public class Vehicle {
    String name;
    int mileage;
    boolean ev;
    double price;

    public Vehicle(String name, int mileage, boolean ev, double price) {
        this.name = name;
        this.mileage = mileage;
        this.ev = ev;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", ev=" + ev +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isEv() {
        return ev;
    }

    public void setEv(boolean ev) {
        this.ev = ev;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
