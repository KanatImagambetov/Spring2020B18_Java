package day43_MethodOverriding;

public class Tesla extends Car{

    public void start(){
        System.out.println("Insert Tesla key");
    }
    public static void main(String[] args) {
        Tesla o1=new Tesla();
        o1.start();
    }
}
