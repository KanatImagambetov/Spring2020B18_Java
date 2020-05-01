package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.addAll(Arrays.asList(7,0,5,0,0,3,5,8,0,0,6));
        System.out.println(num);
        int a1=1;
        num.remove(a1);
        System.out.println(num);


        num.set(0,num.get(4));
        System.out.println(num);
        num.add(3,5);

        System.out.println(num);
        System.out.println("=================");
        ArrayList<Integer> num1=new ArrayList<>();
        Integer a=1;
        System.out.println(num1.remove(a));
        System.out.println("=============");
        num1.add(10);
        System.out.println(num1);
        System.out.println("=====================================================================");


        int count=Collections.frequency(num,0);
        System.out.println(count);
        num.removeAll(Arrays.asList(0));
        System.out.println(num);

        for(int i=count;i>=1;i--){
            num.add(0);
        }
        System.out.println(num);
    }
}
