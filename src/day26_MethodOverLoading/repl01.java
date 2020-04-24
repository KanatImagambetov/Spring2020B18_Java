package day26_MethodOverLoading;

import java.util.Arrays;

public class repl01 {
    public static int wordcount(String words) {
        String[] arr = words.split(" ");
        int count=arr.length;
        return count;
    }
    public static void main(String[] args) {
        String sentence="bvdds dfsds sdsd sdaa";
        int count=wordcount(sentence);
        System.out.println(count);

        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));


    }
}
