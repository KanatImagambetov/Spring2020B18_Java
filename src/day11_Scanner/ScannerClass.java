package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Enter a long number: ");
        Long a=scan.nextLong();

        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal: ");
        Float b=scan.nextFloat();

        System.out.println("You hav entered: "+b);


        System.out.println("Enter true or false: ");
        boolean bool=scan.nextBoolean();

        System.out.println(bool);

        System.out.println("Enter your sentence: ");
        String bool1=scan.next();

        System.out.println("You have entered: "+bool1);





    }


}
