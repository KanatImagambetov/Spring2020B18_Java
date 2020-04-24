package day12_practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter you expected income: ");
        double a=scan.nextDouble();

        System.out.println("Federal tax: ");
        double b=scan.nextDouble();

        System.out.println("State tax: ");
        double c=scan.nextDouble();

        double d=a*(100-b-c)/100;

        System.out.println("Income post tax a year: \n$"+ d);

        System.out.println("Income post tax a month: \n$"+d/12);

        scan.close();




    }


}
