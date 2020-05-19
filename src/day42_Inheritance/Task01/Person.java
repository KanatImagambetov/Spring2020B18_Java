package day42_Inheritance.Task01;

public class Person {
    public String name;
    public int age;
    public char gender;

    public void setPErsonInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void eat(String food){
        System.out.println(name+ " eating");
    }
    public void sleep(){
        System.out.println(name+ " sleeping");
    }
    public void walk(){
        System.out.println(name+ " walking");
    }
    public void drink(String drink){
        System.out.println(name+ " drinking "+drink);
    }
}
