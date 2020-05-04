package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class repl13 {
    public static void main(String[] args){
        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");

        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar
    }//end main
    public static String search(ArrayList<String> r, String find){
        String a="";
        String c="search failed";
        for(int i=0;i<=r.size()-1;i++){
            if(r.get(i).contains(find)) {
                a += r.get(i);
            }
        }
        if(a.length()==0){
            a=c;
        }else{
            a=a;
        }
        return a;
    }
}
