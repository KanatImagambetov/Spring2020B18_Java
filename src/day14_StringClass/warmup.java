package day14_StringClass;

import java.util.Scanner;
/*
write me a programm that asksuser first and last names than prints initials
input
     cybertek
     school
output
     CS
 */
public class warmup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname=input.next();

        System.out.println("Enter your last name: ");
        String lname=input.next();

        String ifname=fname.substring(0,1);
        String ilname=lname.substring(0,1);

        System.out.println(ifname+ilname);


    }



}
