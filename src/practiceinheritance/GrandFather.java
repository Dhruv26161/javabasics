package practiceinheritance;

public class GrandFather {
    private String name;
    private boolean isAlive;
    private int age;

    public GrandFather(String name, boolean isAlive, int age) {
        this.name = name;
        this.isAlive = isAlive;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getAge() {
        return age;
    }
public void displayDetails()
{
    System.out.println("Name : "+name);
    System.out.println("is Alive : "+isAlive);
    System.out.println("Grand father age is : "+age );
}
}
