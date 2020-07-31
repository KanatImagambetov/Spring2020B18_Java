package day43_MethodOverriding;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public void calculatedArea(){
        area=length*width;
        System.out.println("Area of the rectangle "+area);
    }
    public void calculatePErimeter(){
        perimeter=(length+width)*2;
        System.out.println("Perimeter of the rectangle "+perimeter);
    }
}
