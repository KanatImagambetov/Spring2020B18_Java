package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObj {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setDogInfo("Husky","Small",1,"Black","Pretty");
        /*
        dog1.Breed="Husky";
        dog1.size="Small";
        dog1.age=10;
        dog1.color="White";
        dog1.name="Boss";

        System.out.println(dog1.Breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        */
        System.out.println("=================================");
        Dog dog2=new Dog();
        dog2.setDogInfo("Alabay","Big",23,"White","Boss");
        Dog dog3=new Dog();
        dog3.setDogInfo("Poodle","Miniature",3,"Brown","Nice");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("=================================");
        Dog dog4=new Dog();
        dog4.setDogInfo("Poodle","Miniature",1,"Brown","Nice");

        Dog dog5=new Dog();
        dog5.setDogInfo("Poodle","Miniature",2,"Brown","Nice");


        ArrayList<Dog> puppies=new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));
        puppies.addAll(Arrays.asList(dog4,dog5));

        for(int i=0; i<puppies.size();i++){
            Dog each=puppies.get(i);
            System.out.println(each);
        }
        System.out.println("===========================");
        puppies.removeIf(p->p.age>2);
        for(int i=0; i<puppies.size();i++){
            Dog each=puppies.get(i);
            System.out.println(each);
        }
    }
}
