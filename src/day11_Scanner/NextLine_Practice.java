package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age=input.nextByte();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullname=input.nextLine();

        System.out.println("Your age is: "+age+"\n"+"Your name is: "+fullname);





    }



}
