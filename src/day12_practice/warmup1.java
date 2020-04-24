package day12_practice;

import java.util.Scanner;

public class warmup1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String fulladd="";

        System.out.println("Enter the number of the building: ");
        short Bnum=input.nextShort();

        fulladd+=Bnum+" ";

        System.out.println("Enter the street Name: ");
        String streetName=input.next();

        fulladd+=streetName+" ";


        System.out.println("Enter the type of the road: ");
        String roadtype=input.next();

        fulladd+=roadtype+", ";

        System.out.println("Enter city name, state, zipcode: ");
        String cityn=input.next();
        fulladd+=cityn+" ";

        String state=input.next();
        fulladd+=state+", ";

        int zipcode=input.nextInt();
        fulladd+=zipcode;

        System.out.println(fulladd);





    }


}
