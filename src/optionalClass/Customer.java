package optionalClass;

public class Customer {
    private String name;
    private int id;
    private String number;
    private String mailid;
    public Customer(){

    }
    public Customer(String name, int id, String number, String mailid) {
        this.name = name;
        this.id = id;
        this.number = number;
        this.mailid = mailid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

}

