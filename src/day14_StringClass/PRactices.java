package day14_StringClass;

import java.util.Scanner;

public class PRactices {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String w1=input.next();

        System.out.println("Enter second word");
        String w2=input.next();

        System.out.println("Enter third word");
        String w3=input.next();

        int l1=w1.length();
        int l2=w2.length();
        int l3=w3.length();

        boolean allntsame=l1!=l2 && l2!=l3 && l1!=l3;

        if(l1==l2&&l2==l3){
            System.out.println("print all words are the same legnth");
        }else if(allntsame){
            System.out.println("All different legnth");
        }else{
            System.out.println("Not same nor different legnths");
        }






    }

}
