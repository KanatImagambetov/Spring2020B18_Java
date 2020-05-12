package day37_Costructions;

import javax.jws.soap.SOAPBinding;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car("BMW","X5","2020", 100000);
        System.out.println(car1);
        System.out.println("===============================");
        System.out.println(car1.Brand);
        System.out.println("$"+car1.price);
        System.out.println("===============================");
        Car car2=new Car("Toyota","Corolla","2018", 40000);
        System.out.println(car2);

    }
}
