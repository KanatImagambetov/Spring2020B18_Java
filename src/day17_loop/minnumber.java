package day17_loop;

import java.util.Scanner;

public class minnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int minnumber=999999999;
        int maxnumber=-999999999;
        for(int i=1; i<=5; i++){
            System.out.println("Enter number:");
            int num=scan.nextInt();

            if(minnumber>num){
                minnumber=num;
            }
            if(maxnumber<num){
                maxnumber=num;
            }

        }

        System.out.println("Minimum number: "+minnumber);
        System.out.println("Maximum number: "+maxnumber);
    }



}
