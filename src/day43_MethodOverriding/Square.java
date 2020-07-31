package day43_MethodOverriding;

public class Square extends Shape{
    public double side;
    public Square(double side){
        this.side=side;
    }
    public void calculatedArea(){
        area=side*side;
        System.out.println("Area of the square "+area);
    }
    public void calculatePErimeter(){
        perimeter=(side)*4;
        System.out.println("Perimeter of the square "+perimeter);
    }
}
