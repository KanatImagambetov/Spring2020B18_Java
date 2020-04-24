package day20_Arrays;

import java.util.Scanner;

public class months {
    public static void main(String[] args){
        String[] weekdys={"monday", "tuesday", "wendesday", "thursday", "friday", "saturday", "sunday"};
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int wekkday=scan.nextInt();
        int count=0;
        while(wekkday>7||wekkday<1){
            System.out.println("invalid, please inter again");
            wekkday=scan.nextInt();
            count++;
            if(count==2&&(wekkday>7||wekkday<1)){
                System.out.println("more than 3 trials");
                System.exit(0);
            }
        }

        System.out.println(weekdys[wekkday-1]);


    }
}
