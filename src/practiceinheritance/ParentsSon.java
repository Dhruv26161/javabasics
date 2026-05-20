package practiceinheritance;

public class ParentsSon extends GrandFather{
    private String graduation;
    private boolean personality;
    private long phoneNumber;

    public ParentsSon(String name, boolean isAlive, int age,
                      String graduation, boolean personality, long phoneNumber)
    {
        super(name, isAlive, age);
        this.graduation = graduation;
        this.personality = personality;
        this.phoneNumber = phoneNumber;
    }

    public String getGraduation() {
        return graduation;
    }

    public boolean isPersonality() {
        return personality;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Enter your qualifications : "+graduation);
        System.out.println("Good personality : "+personality);
        System.out.println("Enter your phone number : "+phoneNumber);
    }
}
