package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class repl20 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(Arrays.asList("hi","lk","hi","hey","hi","yo"));
        String b="hi";

        System.out.println(removeAll(a,b));
    }
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord) {
        wordList.removeAll(Arrays.asList(targetWord));
        return wordList;
    }
}