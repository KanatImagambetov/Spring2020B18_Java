package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObject3 {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();

        car1.setCarInfo("Toyota", "pRado",2010, "black");
        car2.setCarInfo("BMW", "X5",1900, "white");
    //    car1.getCarInfo();
    //    car2.getCarInfo();

        Car car3=new Car();
        car3.setCarInfo("MAzda","X7",2020,"red");
     //   car3.getCarInfo();

        Car[] cars={car1,car2,car3};

        for(Car each:cars){
            each.getCarInfo();
        }
        System.out.println(car1);
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);


    }
}
