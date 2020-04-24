package day12_practice;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        salary
        full name
        company
        SSN
        JobTitle
         */

        System.out.println("Enter your salary: ");
        int salary=input.nextInt();
        String res="";
        res+=salary;

        input.nextLine();
        System.out.println("Enter your full name");
        String fullna=input.nextLine();

//        input.nextLine();
        System.out.println("Enter your company name");
        String comp=input.nextLine();

        System.out.println("Enter your SSN: ");
        int ssn=input.nextInt();

        input.nextLine();
        System.out.println("Enter your job title");
        String title=input.nextLine();

        System.out.println("Full name: "+fullna+"\nCompany name: "+comp+"\nJob Title: "+title+"\nSSN: "+ssn+"\nsalary: "+salary);





    }


}
