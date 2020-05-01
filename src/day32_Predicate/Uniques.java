package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        Character[] ch={'a','v','g','a','a','g'};
        ArrayList<Character> charL=new ArrayList<>(Arrays.asList(ch));
        System.out.println(charL);

        ArrayList<Character> test=new ArrayList<>();
        for(int i=0; i<charL.size();i++){
//        for(int each: charL){
            int count=Collections.frequency(charL, charL.get(i));
            if(count==1){
                test.add(charL.get(i));
            }
        }
        System.out.println(test);
    }
}
