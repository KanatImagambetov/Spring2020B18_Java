package day30_ArrayList;

import java.util.ArrayList;

public class ArraysList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);

        list.add(1,6);
        list.add(4,9);

        list.set(3,9);

        System.out.println(list);

        int[] arr ={1,2,3,4};
        arr[3]=5;

        ArrayList<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add(1,"C");
        list1.add(2,"D");

        list1.set(3,"F");
        list1.set(2,"E");

        System.out.println(list1);

    }
}
