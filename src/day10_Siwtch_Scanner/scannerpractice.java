package day10_Siwtch_Scanner;

import java.util.Scanner;

public class scannerpractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter you first number: ");
                       Short num1=input.nextShort();
        System.out.println("Enter your second number: ");
                      Short num2=input.nextShort();

                      int total=(num1+num2);
        System.out.println("The sum of "+ num1 + " and " + num2 + " is: " +"\n"+total);




    }



}


