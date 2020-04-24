package day15_loop;

import java.util.Scanner;

public class warpup {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fname=input.next();

        String fname1=fname.substring(0,1).toUpperCase();

        System.out.println("Enter your last name: ");
        String lname=input.next();
        String lname1=lname.substring(0,1).toUpperCase();

        System.out.println(fname1+lname1);

        String in=""+fname.charAt(0)+lname.charAt(0);

        System.out.println(in.toUpperCase());






    }
}
