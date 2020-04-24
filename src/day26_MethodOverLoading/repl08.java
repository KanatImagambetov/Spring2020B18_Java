package day26_MethodOverLoading;

import java.util.Scanner;

public class repl08 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String number=""+num;
        String number2="";
        for(int i=number.length()-1; i>=0; i--){
            number2+=number.charAt(i);
        }
        boolean res=(number.equals(number2));
        System.out.println(res);
    }
}
