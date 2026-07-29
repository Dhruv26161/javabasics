package optionalClass;

public class StudentStaticMethods {
     private String name;
    private int rollno;
    private String phonenumber;

    public StudentStaticMethods()
    {

    }

    public StudentStaticMethods(String name, int rollno, String phonenumber)
    {
        this.name = name;
        this.rollno = rollno;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return "StudentStaticMethods{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
