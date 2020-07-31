package day43_MethodOverriding;

public class Shape {
    public double area;
    public double perimeter;

    public void calculatedArea(){
        area=0;
        System.out.println("Area of the shape "+area);
    }
    public void calculatePErimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape "+perimeter);
    }
}
