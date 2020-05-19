package day41_Inheritance;

public class Fish extends Animal{

    public static void main(String[] args) {
        Fish ob1=new Fish();
        ob1.name="Nemo";
        ob1.weight=5;
        ob1.size="Small";

        ob1.eat();
        ob1.move();
    }
}
