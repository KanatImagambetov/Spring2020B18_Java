package day32_Predicate;

import java.util.Scanner;

public class repl22 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String a="";
        for(int i=0;i<=word.length()-1;i++){
            if(word.charAt(i)==97||word.charAt(i)==101||word.charAt(i)==105||word.charAt(i)==111||word.charAt(i)==117){
                a+=word.charAt(i);
            }//In: poopoo what idk what im doing
        }
        System.out.println(a);

    }
}
