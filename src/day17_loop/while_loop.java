package day17_loop;

import day07_ifstatement.MaxNumber;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        /*
        1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement

         */
        Scanner scan=new Scanner(System.in);
        int max=-999999999;


        for(int i=1; i<=5; i++){
            System.out.println("Enter a number:");
            int num=scan.nextInt();

            if(num> max){
                max=num;
            }


        }
        System.out.println("Maximum number: "+max);



    }



}
