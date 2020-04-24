package day10_Siwtch_Scanner;

import java.util.Scanner;

/*
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */

public class rateCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Enter you an yearly salary: ");
                int num1 = scan.nextInt();
        System.out.println("Enter hours a week: ");
                byte num2 = scan.nextByte();

        System.out.println("Enter weeks in year: ");
        byte num3 = scan.nextByte();

        int hourlyrate = num1/num3/num2;
        System.out.println("The hourly rate: "+"\n"+"$"+hourlyrate);



    }



}
