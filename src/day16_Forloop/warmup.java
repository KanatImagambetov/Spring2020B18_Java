package day16_Forloop;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your words:");
        String in=scan.nextLine();
        String reverse="";

        for(int i=in.length()-1; i>=0; --i){
            reverse+=in.charAt(i);
        }
//        System.out.println(reverse);
        boolean res=in.equalsIgnoreCase(reverse);

        System.out.println(res);



    }



}
