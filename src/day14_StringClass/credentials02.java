package day14_StringClass;

import java.util.Scanner;

/*
        valid credentials are:
            username: cybertek
            password: cybertekschool

        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
*/
public class credentials02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username");
        String inputuser=input.nextLine();

        System.out.println("Enter your password");
        String inputpass=input.nextLine();


        if(!inputuser.isEmpty()&&!inputpass.isEmpty()){
            if(inputpass.equals("Cybertek")&&inputuser.equals("cybertekschool")){
                System.out.println("Logged in");
            }else if(inputpass.equals("Cybertek")&&!inputuser.equals("cybertekschool")){
                System.out.println("username is invalid, but password is valid");
            }else if(!inputpass.equals("Cybertek")&&inputuser.equals("cybertekschool")){
                System.out.println("password is invalid, username is valid");
            }else{
                System.out.println("password and username are invalid");
            }

        }else{
            System.out.println("pls enter the credentials");
        }





    }



}
