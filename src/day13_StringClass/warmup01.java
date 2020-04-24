package day13_StringClass;
/*
		2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:

			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
import java.util.Scanner;
public class warmup01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("building number");
        int bnum=input.nextInt();

        input.nextLine();
        System.out.println("Street address");
        String str=input.nextLine();

        System.out.println("City name");
        String city=input.next();

        System.out.println("State name");
        String state=input.next();

        System.out.println("Zip code");
        int znum=input.nextInt();

        input.nextLine();
        System.out.println("full name of the person");
        String fnam=input.nextLine();

//        String fname=input.nextLine();
        System.out.println("Ship to: "+fnam);
//        System.out.println("\t\t"+fname);
        System.out.println("\t\t"+bnum+" "+str);
        System.out.println("\t\t"+city+", "+state+" "+znum);
 //       fnam.equalsIg



    }

}
