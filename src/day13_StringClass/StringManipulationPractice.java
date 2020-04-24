package day13_StringClass;

import java.util.Scanner;

public class StringManipulationPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullname=input.nextLine();

        String fname=fullname.substring(0, fullname.indexOf(" "));
        String lname=fullname.substring(fullname.indexOf(" ")+1);

        fname=fname.substring(0,1).toUpperCase()+fname.substring(1).toLowerCase();
        lname=lname.substring(0,1).toUpperCase()+lname.substring(1).toLowerCase();


        System.out.println("Your first name is "+fname);
        System.out.println("Your last name is "+lname);
/*
write me a programm that asksuser first and last names than prints initials

input
     cybertek
     school
output
     CS
 */

    }



}
