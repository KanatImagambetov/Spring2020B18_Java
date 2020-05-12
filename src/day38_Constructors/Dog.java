package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;
    public Dog(String name){
       this.name=name;
        this.breed="unknown";
        this.age=0;
    }
    public Dog(String breed, int age){
        this.breed=breed;
        this.age=0;
    }
    public Dog(String name, String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public Dog(int age, String name){
        this.name=name;
        this.breed="null";
        this.age=age;
    }
    public Dog(){
    }
    public String toString(){
        return "Name is "+name+", breed "+breed+", age "+age;
    }
}
