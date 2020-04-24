package day12_practice;

import java.util.Scanner;

public class Scan_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Building number: ");
        int Bnum=input.nextInt();

        System.out.println("building number is: "+Bnum);

        input.nextLine();
        System.out.println("Street: ");
        String street=input.nextLine();
        System.out.println("Street is: "+street);

        System.out.println("Enter the zip code: ");
        int zip=input.nextInt();

        System.out.println("Enter the zip code: "+zip);

        input.nextLine();
        System.out.println("Enter city and state: ");
        String city=input.nextLine();

        System.out.println("the city and state: "+city);

        String fulladdress=Bnum+" "+street+" "+city+" "+zip;
        System.out.println(fulladdress);
        input.close();


    }


}
