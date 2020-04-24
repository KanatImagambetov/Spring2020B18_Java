package day20_Arrays;

import java.util.Scanner;

public class repl9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of population: ");
        int popul=input.nextInt();
        int day=0;

        while(popul>=0){
            popul = popul / 2;
            if(popul==0){
                System.out.println("---- EXTINCT ----");
                System.exit(0);
            }
            if(popul>=1) {
                if(day==0){
                    System.out.println("Day " + day + " [" + popul*2 + "]");
                    day++;
                }
                if (day>0){
                    System.out.println("Day " + day + " [" + popul + "]");
                    day++;
                }
            }
        }
    }
}
