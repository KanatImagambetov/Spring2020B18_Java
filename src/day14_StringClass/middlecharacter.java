package day14_StringClass;

import java.util.Scanner;

public class middlecharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String w=input.next();

        String mid="";

        int total=w.length();
        int midnumber=total/2;
        if(total%2!=0){
            mid+=w.charAt(midnumber);
        }else{
            mid+=w.charAt(midnumber-1)+""+w.charAt(midnumber );

        }
        System.out.println(mid);
    }



}
