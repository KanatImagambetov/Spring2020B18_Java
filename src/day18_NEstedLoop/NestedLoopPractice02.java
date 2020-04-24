package day18_NEstedLoop;

import java.util.Scanner;

public class NestedLoopPractice02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true) {

            System.out.println("Enter tewo numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Addition of two numbers: " + (num1 + num2));

            System.out.println("Do you want to continue");
            String answer=scan.next();
            while(!(answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("yes"))){
                System.out.println("invalid, please re-enter yes or no");
                answer=scan.next();
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break;
            }

        }


    }
}
