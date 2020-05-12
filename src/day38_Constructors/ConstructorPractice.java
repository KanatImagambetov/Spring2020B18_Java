package day38_Constructors;

public class ConstructorPractice {
    public ConstructorPractice(){
        this(10.0);
        System.out.println("A");
    }
    public ConstructorPractice(int a){
        this();
        System.out.println("B");
    }
    public ConstructorPractice(double a){
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorPractice(1);
    }
}
