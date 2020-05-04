package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Integer max=Collections.max(list);
        System.out.println(max);
        list.removeAll(Arrays.asList(max));
        System.out.println(list);
        Integer max1=Collections.max(list);
        System.out.println(max1);
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Integer min=Collections.min(list1);
        System.out.println(min);

        list1.removeAll(Arrays.asList(min));
        System.out.println(list1);

        int Senmin=Collections.min(list1);
        System.out.println(Senmin);

        System.out.println("===========================================");
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(Arrays.asList(1,2,3,4,5));

        Collections.swap(arr, 0,4);
        System.out.println(arr);
        System.out.println("===========================================");
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.addAll(Arrays.asList(1,2,3,4,5));

        Collections.replaceAll(arr1, 1,4);
        System.out.println(arr1);
        arr1.set(1,9);
        System.out.println(arr1);
        System.out.println(arr1.get(0));
        System.out.println(arr1);
    }
}
