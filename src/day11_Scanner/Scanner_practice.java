package day11_Scanner;

import java.util.Scanner;

/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0

    output:
        full name:
        employeeed status:
        salary:
 */
public class Scanner_practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String a=scan.next();

        System.out.println("Enter your last name: ");
        String a1=scan.next();

        System.out.println("Are you employeed or not?");
        boolean a2=scan.nextBoolean();

        double a3=0;

        if(a2==true){
            System.out.println("Enter your salary: ");
            a3=scan.nextDouble();
        }


        System.out.println("The first name is "+a+"\n"+"The last name is "+a1);
        System.out.println("Employeed "+a2);
        System.out.println("the salary is $"+a3);




    }




}
