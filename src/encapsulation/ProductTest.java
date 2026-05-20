package encapsulation;

public class ProductTest {
    static void main(String[] args) {
        Product p=new Product("Campa",1250,1250000);
        p.getName();
        p.getSize();
        p.getPrice();
        System.out.println("Name is...."+p.getName());
        System.out.println(+p.getSize());
        System.out.println(+p.getPrice()
        );
    }
}
