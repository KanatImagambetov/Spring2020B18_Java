package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class repl23 {
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int each:nums){
            list1.add(each);
            list1.add(each);
        }
        return list1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(twoTimes(list));

    }
}
