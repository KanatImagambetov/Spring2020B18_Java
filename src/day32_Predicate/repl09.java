package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class repl09 {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("asasa");
        ArrayList<String> a2=new ArrayList<>();
        a2.add("qwqqwq");
        test(a1,a2);

    }
    public static void test(ArrayList<String> wordList1,ArrayList<String> wordList2)
    {
        ArrayList<String> a=new ArrayList<>();

        for(String each:wordList1){
            a.add(each);
        }
        for(String each:wordList2){
            a.add(each);
        }
        System.out.println(a);
    }
}
