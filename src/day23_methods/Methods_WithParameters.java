package day23_methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        EligibleToBuyAlcohol(num);

    }
    public static void EligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible to by alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
    }
}
