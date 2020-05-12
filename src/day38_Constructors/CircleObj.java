package day38_Constructors;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CircleObj {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        Circle obj1=new Circle(r);
        Circle obj2=new Circle(23);
        Circle obj3=new Circle(100);
//        System.out.println(obj1);

        ArrayList<Circle> objList=new ArrayList<>();
        objList.addAll(Arrays.asList(obj1,obj2,obj3));
        System.out.println("Area is "+df.format(obj1.area()));



    }
}
