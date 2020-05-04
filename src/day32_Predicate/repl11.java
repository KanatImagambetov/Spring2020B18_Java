package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class repl11 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,-3,4,5,6,7,-8,9));
        appendPosSum(list1);
        int a1=list1.get(1);
        System.out.println(a1);

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> a) {
        ArrayList<Integer> b=new ArrayList<>();
        int c=0;
        for(int each:a){
            if(each>=0){
                b.add(each);
                c+=each;
            }
        }
        b.add(c);
        return b;
    }
}
