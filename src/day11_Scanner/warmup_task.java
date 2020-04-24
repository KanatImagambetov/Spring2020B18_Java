package day11_Scanner;

import java.util.Scanner;
/*
        2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */
public class warmup_task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee' salary");
        long num1 = input.nextLong();
        System.out.println("Enter the state tax");
        double num2 = input.nextDouble();
        System.out.println("Enter the federal tax");
        double num3 = input.nextDouble();

        double thesalary_after_tax=num1*(1-num2-num3);

        System.out.println("the salary after tax: "+"\n"+"$\t"+(int)thesalary_after_tax);
        System.out.println("Total tax: \n $\t"+(num1*(num2+num3)));


    }

}
