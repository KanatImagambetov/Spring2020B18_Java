package day22_ArraysLoop;

import java.util.Arrays;

public class repl06 {
    public static void main(String[] args) {
        String[] words={"aaa", "bbbbb", "whasstupppjjjjjjjjjjjjp", "longg" , "jaaaaavvaaaaaaaaaa"};

        int max=words[0].length();
        String longest="";

        for(int i=0; i<=words.length-1; i++){
            if(words[i].length()>=max){
                max=words[i].length();
                longest=words[i];
            }
        }
        System.out.println(longest);
    }
}
