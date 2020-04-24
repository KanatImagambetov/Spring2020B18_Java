package day12_practice;

import java.util.Scanner;

/*
 1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle
 */

public class warmup {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter radius of the cirle: ");
        int rad=input.nextInt();

        double calc=3.14*rad*rad;

        System.out.println("The area of circle: \n"+calc);

        /*
        2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
         */
 //       input.nextLine;
        System.out.println("input two words");
        String a=input.next();


        String b=input.next();


        System.out.println("output two words");
        System.out.println(a+b);

  /*
      3. Write a Java Program that can calculate the garde of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
   */
        System.out.println("Enter the grade of the student: ");
        int grade=input.nextInt();

        if(grade>60){
            if(grade>=60 && grade<90){
                System.out.println("Pass");
            }else{
                System.out.println("Passed with Disctinction");
            }

        }else{
            System.out.println("Fail");
        }








    }





}
