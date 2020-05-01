package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupl {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,6,6));

        System.out.println(list);

        ArrayList<Integer> res=new ArrayList<>();

        for(Integer each:list){
            if(!res.contains(each)){
                res.add(each);
            }
        }
        System.out.println(res);
        System.out.println("============================================");
        Integer[] arr1={1,1,2,2,3,3,4};
        ArrayList<Integer> NoDp=new ArrayList<>();



    }
}
