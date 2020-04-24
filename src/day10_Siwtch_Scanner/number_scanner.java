package day10_Siwtch_Scanner;


import java.util.Scanner;

public class number_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Number #1");
        int num1=scan.nextInt();

        System.out.println("Number #2");
        int num2=scan.nextInt();

        System.out.println("Number #3");
        int num3=scan.nextInt();

        boolean maxnum1= num1>num2 && num1>num3;
        boolean maxnum2= num2>num1 && num2>num3;
        boolean maxnum3= num3>num2 && num3>num1;

        int max=0;


        if(maxnum1){
            System.out.println("Maximum number: "+"\n"+num1);
        }else if(maxnum2){
            System.out.println("Maximum number: "+"\n"+num2);
        }else if(maxnum3){
                System.out.println("Maximum number: "+"\n"+num3);
        }else{
            System.out.println("Maximum number: Invalid");
        }

        if(num1<num2 && num1<num3){
            System.out.println("Minimum number: "+"\n"+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("Minimum number: "+"\n"+num2);
        }else if(num3<num2 && num3<num1){
            System.out.println("Minimum number: "+"\n"+num3);
        }else{
            System.out.println("Minimum number: Invalid");
        }

    }



}
