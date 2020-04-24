package day14_StringClass;

import java.util.Scanner;
public class credentials {
    public static void main(String[] args) {


        String validusername = "sybertek";
        String validpassword = "sybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");

        String inputN=input.next();

        System.out.println("Enter your password: ");

        String inputP=input.next();

        if(inputN.equals(validusername)&&inputP.equals(validpassword)){
            System.out.println("Log is successfully");
        }else{
                     System.out.println("Invalid crediantial");
        }

    }



}
