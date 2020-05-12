package day38_Constructors;

public class Circle {
    static double PI=3.14;
    double radius;
    double diameter;
    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
    }
    public double area(){
        return PI*radius*radius;
    }
    public double perimeter(){
        return diameter*PI;
    }
    public String toString(){
        return "Area is "+area()+": \nPerimeter is "+perimeter()+": \nRadius is "+radius;
    }
}
