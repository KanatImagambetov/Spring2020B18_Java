package day17_loop;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter username:");
        String  username=inp.next();
        System.out.println("Enter password");
        String  password=inp.next();
        boolean valid=username.equals("cybertek")&&password.equals("cybertek123");

        int count=1;

        while(!valid){
            System.out.println("Please Re-enter your credentions");
            System.out.println("Enter username:");
            username=inp.next();
            System.out.println("Enter password");
            password=inp.next();

            valid=username.equals("cybertek")&&password.equals("cybertek123");
            count++;
            if(count==3 && !valid){
                System.out.println("Your account is locked");
                break;
            }
//            if(count<=3&&valid){
//                System.out.println("Logged in");
 //               break;

        }
        if(valid){
            System.out.println("Logged in");

        }

 //






    }
}
