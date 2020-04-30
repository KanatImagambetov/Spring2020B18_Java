package Office_hours_29042020;

import java.util.ArrayList;

public class ArrayMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(0, 30);
        list.set(1, 30);

        System.out.println(list);
        System.out.println(list.size());
        long num=list.get(2);

    }
}
