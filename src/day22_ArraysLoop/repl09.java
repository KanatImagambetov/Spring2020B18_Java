package day22_ArraysLoop;

import java.util.Arrays;

public class repl09 {
    public static void main(String[] args) {
        String[] words={"hello", "why", "by", "apple" , "note"};

        String sentence="";
        for(int i=0; i<=words.length-1;i++){
            words[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1)+" ";
            sentence+=words[i];
        }
        String[] str=sentence.split(" ");
        System.out.print(Arrays.toString(str));
    }
}
