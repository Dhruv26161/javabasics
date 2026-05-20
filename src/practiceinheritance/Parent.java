package practiceinheritance;

public class Parent extends GrandFather {
    private String dateOfBirth;
    public double salary;
    public boolean hasOwnHouse;

    public Parent(String name, boolean isAlive, int age,
                  String dateOfBirth, double salary, boolean hasOwnHouse) {
        super(name, isAlive, age);
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.hasOwnHouse = hasOwnHouse;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isHasOwnHouse() {
        return hasOwnHouse;
    }

    @Override
    public void displayDetails() {
        System.out.println("Enter DOB : "+dateOfBirth);
        System.out.println("Your Salary is : "+salary);
        System.out.println("You has your own house : "+hasOwnHouse);
    }
}
