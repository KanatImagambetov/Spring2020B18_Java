package day33_CustomClass;

public class CarObj {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.Brand="Toyota";
        car1.model="Corola";
        car1.color="White";
        car1.year=2012;

        System.out.println(car1.Brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println("=======================================================");

        Car car2=new Car();
        car2.Brand="BWM";
        car2.model="X5";
        car2.color="Black";
        car2.year=2020;

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        car2.start();
        car2.drive();
        car2.getCarInfo();
        System.out.println("===========================================");

        Car car3=new Car();
        car3.Brand="Mercedes";
        car3.model="C class";
        car3.color="blue";
        car3.year=2020;
        car3.getCarInfo();
        car3.start();

        String str="A";
        String str2="B";
        String[] arr={str,str2};
        Car[] cars={car1,car2,car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();
    }
}

