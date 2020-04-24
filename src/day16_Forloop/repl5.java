package day16_Forloop;

import java.util.Scanner;

public class repl5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        String fname="";
        String lname="";
        String ename="";
        String email1="";
        if(email.contains("_")) {
            fname = email.substring(0, email.indexOf("_"));
            lname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            ename = email.substring(email.indexOf("@"));
            email1=lname + "_" + fname + ename;
        }else{
            email1=email;
        }
        System.out.println(email1);
    }
}
