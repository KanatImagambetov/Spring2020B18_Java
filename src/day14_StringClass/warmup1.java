package day14_StringClass;

import java.util.Scanner;

public class warmup1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String w1=input.next();
//        w1=w1.substring(1,w1.length());
        w1=w1.substring(1);

        System.out.println("Enter second word");
        String w2=input.next();
        w2=w2.substring(1,w2.length());

        String r=w1+w2;

        System.out.println(r);





    }
}
