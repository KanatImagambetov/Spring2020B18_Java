package day23_methods;

import java.util.Scanner;

public class repl05 {
    public static void main(String[] args) {
             Scanner inp = new Scanner(System.in);
            System.out.print("enter number");
            int num = inp.nextInt();
            numbers(num);
    }
    public static void numbers(int num1){
        System.out.println((num1+1)+" "+(num1+2)+" "+(num1+3));
    }
}
