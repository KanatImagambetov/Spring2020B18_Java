package day18_NEstedLoop;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
//        int num1=scan.nextInt();
        int max=-999999999;
        int min=999999999;
        for(int i=1; i<=10; i++){
            int num=scan.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);


    }
}
