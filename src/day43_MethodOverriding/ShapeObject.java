package day43_MethodOverriding;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle01=new Circle(5.5);
 //       System.out.println(circle01.radius);

        circle01.calculatedArea();
        circle01.calculatePErimeter();
        System.out.println("============================");

        Rectangle rec1=new Rectangle(3,2);
        System.out.println(rec1.width);
        System.out.println(rec1.length);

        rec1.calculatedArea();
        rec1.calculatePErimeter();
        System.out.println("=============================");

        Square sq1=new Square(3);
        System.out.println(sq1.side);
        sq1.calculatedArea();
        sq1.calculatePErimeter();

    }
}
