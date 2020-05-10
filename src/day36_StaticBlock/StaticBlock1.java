package day36_StaticBlock;

public class StaticBlock1 {
    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
        method1();
    }

    public static void method1() {
        System.out.println("Custom method executed");
    }
    static{
        System.out.println("Hello World");
    }
}
