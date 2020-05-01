package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.addAll(Arrays.asList(0,0,0,0,0,7,0,5,0,0,3,5,8,0,0,6));
        System.out.println(num);

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
