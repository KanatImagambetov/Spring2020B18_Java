package day38_Constructors;

import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        System.out.println(dog1.name);
 //       Dog dog2=new Dog("Kanat", "Pudel");
 //       System.out.println(dog2.name);
        System.out.println("==================");
        Dog dog3=new Dog("Poodle",4);
        System.out.println(dog3.breed);
        System.out.println(dog3);
        Dog dog4=new Dog(4,"Dina");
        System.out.println(dog4);


    }
}
