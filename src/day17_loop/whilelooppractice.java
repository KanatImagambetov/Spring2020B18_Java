package day17_loop;

import java.util.Scanner;

public class whilelooppractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String answer=scan.next();
        boolean valid=answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No");

        while(!valid){
            System.out.println("please re-enter");
            answer=scan.next();
            if(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No")){
 //               if(valid){

                break;
            }
        }
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");

        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Entered No");
        }

    }
}
