package day31;

import java.util.ArrayList;
import java.util.Collections;

public class day31_BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        Collections.sort(list3);
        System.out.println(list3);

        ArrayList<Integer> reversedList3=new ArrayList<>();

        for(int i=list3.size()-1; i>=0;i--){
            System.out.print(list3.get(i)+" ");
        }
        System.out.println();
        for(int i=list3.size()-1; i>=0;i--){
            reversedList3.add(list3.get(i));
        }
        System.out.println(reversedList3);

        list3.clear();
        System.out.println(list3);
        boolean r4=list3.isEmpty();
        System.out.println(r4);

    }
}
