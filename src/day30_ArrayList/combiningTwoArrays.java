package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class combiningTwoArrays {
    public static void main(String[] args) {
        String[] arr1={"A","B","V"};
        String[] arr2={"v","s","q", "h"};
        System.out.println(Arrays.toString(arr1));

        ArrayList<String> list=new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            list.add(arr1[i]);
        }
         for(String each:arr2){
             list.add(each);
         }
        System.out.println(list);
    }
}
