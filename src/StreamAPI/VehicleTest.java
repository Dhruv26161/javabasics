package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class VehicleTest {
    static void main(String[] args) {
        List<Vehicle> v= Arrays.asList(
                new Vehicle("ertiga",25,false,1400000),
                new Vehicle("nano",32,false,311000),
                new Vehicle("punch",22,true,2500000),
                new Vehicle("xuv",11,false,800000),
                new Vehicle("bmw",22,true,560000),
                new Vehicle("fortuner",12,false,6000000),
                new Vehicle("audi",9,true,12000000),
                new Vehicle("mercedez",8,true,20000000),
                new Vehicle("rolls_royce",1,false,80000000)
        );
        List<Vehicle> list = v.stream().
                filter(x -> x.price > 2000000)
                .toList();
        System.out.println(list);
    }
}
