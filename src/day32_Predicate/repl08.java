package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class repl08 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int b=sum(list1);
        System.out.println(b);

    }
    public static int sum(ArrayList<Integer> ints){
        //write code here
        int a=0;
        for(int each:ints){
            a+=each;
        }
        return a;
    }
}
