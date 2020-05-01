package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.addAll(Arrays.asList(0,0,0,0,0,7,0,5,0,0,3,5,8,0,0,6));
        System.out.println(num);
        int count=0;

        for(int each:num){
            if(each==0){
                count++;
            }
        }
        System.out.println(count);
        num.removeAll(Arrays.asList(0));
        System.out.println(num);

        for(int i=count;i>=1;i--){
            num.add(0);
        }

        System.out.println(num);

    }
}
