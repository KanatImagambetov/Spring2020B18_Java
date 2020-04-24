package day18_NEstedLoop;

import java.util.Scanner;

public class FactoriaNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        int account=1;

        while(num>=1){
            account*=num;
            num--;
        }
        System.out.println(account);


    }

}
