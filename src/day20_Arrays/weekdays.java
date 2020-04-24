package day20_Arrays;

import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scan.nextInt();
        int attemp=0;
        String[] months={"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "novemner", "december"};

        String[] months2=new String[12];


        while(num>12||num<1){
            System.out.println("Invalid entry\nRe entry the number");

            num=scan.nextInt();
            attemp++;
            if(attemp>=2){
                System.out.println("invalid, more than 3 trials");
                System.exit(0);
            }

        }
        System.out.println(months[num-1]);

    }
}
