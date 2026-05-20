package practiceinheritance;

public class MySon extends GrandFather{
    private String birthYear;
    private boolean job;
    private double married;

    public MySon(String name, boolean isAlive, int age,
                 String birthYear, boolean job, double married)
    {
        super(name, isAlive, age);
        this.birthYear = birthYear;
        this.job = job;
        this.married = married;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public boolean isJob() {
        return job;
    }

    public double getMarried() {
        return married;
    }

    @Override
    public void displayDetails() {
        System.out.println("My son birth year : "+birthYear);
        System.out.println(" is my son employed : "+job);
        System.out.println("My son married ? : "+married);
    }
}
