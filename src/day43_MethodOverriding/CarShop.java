package day43_MethodOverriding;

public class CarShop {
    public static void main(String[] args) {
        Tesla o2=new Tesla();
        o2.start();

        System.out.println("===========================");
        Honda o3=new Honda();
        o3.start();
        System.out.println("===========================");
        Jeep o4=new Jeep();
        o4.start();
        System.out.println("===========================");
        BMW o5=new BMW();
        o5.start();
    }
}
