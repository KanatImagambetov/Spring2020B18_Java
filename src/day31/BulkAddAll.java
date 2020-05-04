package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkAddAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
/*        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
 */
        Integer[] arr1={30,20,40,50,60};
        list.addAll(Arrays.asList(10,20,30,40));
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list);
        System.out.println(list1);
        System.out.println("==============================================");
        String[] names={"daasd", "ddasdda", "adsseweew", "ggfffdfd"};

        ArrayList<String> nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        nameList.add("Osman");
        nameList.add("Osman");
        nameList.remove("daasd");
        System.out.println(nameList);
        System.out.println("=================");
        Integer[] num={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numlist=new ArrayList<>(Arrays.asList(num));

        System.out.println(numlist);


    }
}
