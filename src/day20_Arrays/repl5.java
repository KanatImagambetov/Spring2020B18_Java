package day20_Arrays;

import java.util.Arrays;

public class repl5 {
    public static void main(String[] args) {
    String[] words={"hello", "cally", "fkfld"};
        Arrays.toString(words);
    String[] words1=new String[words.length-1];
        for(int i=0; i<=words.length-1; i++){
 //           String last=words[i].length();
            System.out.print(words[i].substring(0,1)+words[i].substring(words[i].length()-1));

        }

    }
}

