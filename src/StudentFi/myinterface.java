package StudentFi;

public interface myinterface {
    static void CollegeName() {
       // System.out.println("CareerCraft Technologies");
    }
    default void Position()
    {
        //System.out.println("tell me your position");
    }
    default void StudentName()
    {
       // System.out.println("what's is your name");
    }
    default void ContactNo()
    {
       // System.out.println("your mobile number");
    }

    default void RollNo()
    {
        System.out.println("Student roll number");
    }
}
