package day16_Forloop;

import java.util.Scanner;

public class repl3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        String fname="";
        if(!email.contains("_")) {
            fname = email;
        }else{
            fname = email.substring(0, email.indexOf("_"));
        }


        String lname="";
        if(!email.contains("_")) {
            lname = email;
        }else{
            lname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        }

        String ename = email.substring(email.indexOf("@"));
        boolean num = email.contains("_");

        String email1="";
        if (email.contains("_")) {
            email1=lname + "_" + fname + ename;
        }else{
            email1=email;
        }
        System.out.println(email1);







    }
}
