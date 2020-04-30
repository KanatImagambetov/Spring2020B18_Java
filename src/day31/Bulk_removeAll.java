package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(8,1,2,3,1,1,1,1,4,5,67,8));

        Integer a=1;
        list.remove(a);
        list.remove(a);

        System.out.println(list);

        list.removeAll(Arrays.asList(1,8));
        System.out.println(list);

        Integer[] arr={3,1,5,8};
        list.removeAll(Arrays.asList(arr));

        System.out.println(list);
        System.out.println("===================================");

        String[] names={"Ahmed","Kanat","kairat","Ahmed","madina"};
        ArrayList<String> namesL=new ArrayList<>(Arrays.asList(names));
        System.out.println(namesL);
        namesL.removeAll(Arrays.asList("Ahmed"));
        System.out.println(namesL);

        }
}
