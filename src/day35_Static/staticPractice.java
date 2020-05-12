package day35_Static;

import java.util.Scanner;
//static Scanner input=new Scanner(System.in);

public class staticPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1=input.nextInt();
        System.out.println("Enter number 2");
        int number2=input.nextInt();
        System.out.println("sum is: "+(number1+number2));

    }
    public void method1(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1-");
        int number1=input.nextInt();
        System.out.println("Enter number 2-");
        int number2=input.nextInt();
        System.out.println("Multiplication is: "+(number1*number2));

    }
}
