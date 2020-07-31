package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class TryAndCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Tester started");
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try{
            System.out.println(list.get(14));
        }catch(Exception e){
            System.out.println("something went wrong");
        }

        System.out.println("Test completed");
    }
}
