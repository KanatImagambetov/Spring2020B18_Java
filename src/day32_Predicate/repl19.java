package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class repl19 {
    public static void main(String[] args) {
        String[] names={"Ahmed","Kanat","kairat","Ahmed","madina"};
        String[] names1={"aaa","bb","ccc"};
        ArrayList<String> namesL=new ArrayList<>(Arrays.asList(names));
        ArrayList<String> namesL1=new ArrayList<>(Arrays.asList(names1));
        ArrayList<String> a=combineAL(namesL,namesL1);
        System.out.println(a);
    }
    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> a=new ArrayList<>();
        for(String each:wordList1){
            a.add(each);
        }
        for(String each:wordList2){
            a.add(each);
        }
        return a;
    }
}
