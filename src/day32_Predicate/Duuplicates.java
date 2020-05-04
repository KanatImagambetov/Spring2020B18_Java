package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duuplicates {
    public static void main(String[] args) {
        ArrayList<String> num=new ArrayList<>();
        num.addAll(Arrays.asList("A","B","A","C","D","A"));
        System.out.println(num);

        ArrayList<String> list=new ArrayList<>();
        for(int i=0; i<num.size();i++){
            int count=0;
            for(String each:num){
                if(each.equals(num.get(i))){
                    count++;
                }
            }
            if(count>1){
                list.add(num.get(i));
            }
        }
        System.out.println(list);
    }
}
