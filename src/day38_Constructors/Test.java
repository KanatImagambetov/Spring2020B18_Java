package day38_Constructors;

public class Test {
    public Test(){
        System.out.println("Constructor");
    }

    {System.out.println("Instance Block");}

    public static void main(String[] args) {
        new Test();
        System.out.println("Main");

     //   new Test();
    }
    static {
        System.out.println("Static Block");
    }
}
