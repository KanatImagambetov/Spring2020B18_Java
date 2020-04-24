package day22_ArraysLoop;

import java.util.Arrays;

public class repl01 {
    public static void main(String[] args) {
        String sentence="Java is fun";
        String reversed="";
        String[] words=sentence.split(" ");
        for(int i=words.length-1;i>=0; i--){
            String word=words[i];
            reversed+=" "+word;
        }
        reversed=reversed.trim();

        System.out.println(reversed);

        System.out.println("=================================");
        String sentence1="Java is fun";
        String[] words1=sentence1.split(" ");
        for(String each: words1){
            System.out.println(each);
        }
   }
}
