package StreamAPI;

public class Teachers {
    String name;
    int id;
    double phonenumber;

    public Teachers(String name, int id, double phonenumber) {
        this.name = name;
        this.id = id;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phonenumber=" + phonenumber +
                '}';
    }

}
