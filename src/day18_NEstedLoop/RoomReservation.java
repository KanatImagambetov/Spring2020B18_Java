package day18_NEstedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
/*
 Assignment:

    write a program for the room reservation:

            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter

                    calculate the total price

                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$

                            if answer either yes or no ==> please re-enter
 */
       Scanner scn=new Scanner(System.in);
        System.out.println("Good day, Please let me know if you would like to reserve a room");
//           scn.nextLine();

       while(true) {
           String answer = scn.nextLine();
           boolean tr = !(answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("yes"));
           if (tr) {
               System.out.println("Please re-enter your answer again in the mean of YES or NO");
               answer = scn.nextLine();
           }
           if (answer.equalsIgnoreCase("No")) {
               System.out.println("Thank you for your call, have a good day!");
               System.exit(0);
           }
           while(answer.equalsIgnoreCase("yes")) {

               System.out.println("We can offer you the following options:\n" + "            King Bed ==> 120$ per night\n" + "            Queen Bed ==> 100$ per night\n" + "            single Bed ==> 80$ per night");
               System.out.println("Please let me know which kind of room would you like to reserve");
               String answer1 = scn.nextLine();
               System.out.println("Please enter number of nights");
               int night = scn.nextInt();

               int totalprice = 0;

               if (answer1.equalsIgnoreCase("King Bed")) {
                   totalprice = 120 * night;
               } else if (answer1.equalsIgnoreCase("Queen Bed")) {
                   totalprice = 100 * night;
               } else if (answer1.equalsIgnoreCase("Single Bed")) {
                   totalprice = 80 * night;
               }

               System.out.println("Please confirm the room type - " + answer1 + " and the following number of nights " + night);
               System.out.println("please enter confirmed or Not");
               String conf = scn.next();

               if (conf.equalsIgnoreCase("confirmed")) {
                   System.out.println("Total price: $" + totalprice);
                   System.exit(0);
               }
               if(conf.equalsIgnoreCase("Not")){
                   System.out.println("Please let me know if you would like to reserve a room");
                   answer = scn.nextLine();
               }
           }

       }
    }

}
