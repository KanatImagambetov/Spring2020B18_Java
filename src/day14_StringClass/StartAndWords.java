package day14_StringClass;

import java.util.Scanner;

public class StartAndWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String w1=input.next();

        System.out.println("Enter second word");
        String w2=input.next();

        int lg1=w1.length();
        int lg2=w2.length();

        if(lg1==5 && lg2==5){
            if(w1.charAt(lg1-1)==w2.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }
        }else{
            System.out.println("need to be exactly 5 chars length");
        }



    }

}
