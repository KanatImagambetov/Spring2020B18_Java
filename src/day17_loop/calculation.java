package day17_loop;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
/*
write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)

						then the system will give the result based on the operator

						at the end it will ask if the user want's to
 */
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i==0; ) {

            System.out.println("Enter the first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scan.nextInt();
            System.out.println("Math operator:");
            char math = scan.next().charAt(0);

            if (math=='+') {
                System.out.println("Addiition is: " + (num1 + num2));
            } else if (math=='-') {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (math=='*') {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (math=='/') {
                System.out.println("division is: " + ((double) num1 / (double) num2));
            } else if (math=='%') {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("invalid operator!");
            }

            System.out.println("Do you want to continue");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break;
            }




        }
    }
}
