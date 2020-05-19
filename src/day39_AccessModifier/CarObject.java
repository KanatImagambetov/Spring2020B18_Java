package day39_AccessModifier;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car("Toyota");
        System.out.println(car1);
        System.out.println("===========================");
        Car car2=new Car("BMW","X6");
        System.out.println(car2);
        System.out.println("===========================");
        Car car3=new Car("Tesla","model3",2020,40000);
        System.out.println(car3);
    }
}
