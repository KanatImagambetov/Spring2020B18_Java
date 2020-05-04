package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class repl12 {
    public static void main(String[] args) {
        ArrayList<String> b = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        String a="hi";
        ArrayList<String> c=removeAll(b,a);
        System.out.println(c);

    }
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord) {
        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }
}
