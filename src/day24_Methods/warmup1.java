package day24_Methods;

import java.util.Scanner;

public class warmup1 {
    public static void MAx(int num1, int num2) {
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter 1st number:");
  //        int num1=scan.nextInt();
    //    System.out.println("Enter 2nd number:");
      //  int num2=scan.nextInt();
        if(num1>num2){
            System.out.println("Maximum is "+num1);
        }else{
            System.out.println("Minimum is "+num2);
        }
    }

    public static void calculator(int a, int b, char operator) {

        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }

    }

    public static void paliodram(String str) {
        str=str.toLowerCase();
        String reversed="";

        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed.equals(str));
    }

    public static void main(String[] args) {
        int a=10000;
        int b=20;

        MAx(a,b);

        paliodram("level");

        calculator(10,300, '*');
        Scanner scan=new Scanner(System.in);

        while(true) {
            System.out.println("Enter 1st number:");
            int num1 = scan.nextInt();
            System.out.println("Enter 2nd number:");
            int num2 = scan.nextInt();
            System.out.println("Enter operator:");
            char oper = scan.next().charAt(0);
            calculator(num1, num2, oper);
            System.out.println("Do you want to continue?");
            String answer = scan.next();
            while(!(answer.equals("no")||answer.equals("yes"))){
                System.out.println("invalid entry, please re-entry");
                System.out.println("Do you want to continue?");
                answer=scan.next();
            }
            if(answer.equals("no")){
                break;
            }
        }

   }



}
