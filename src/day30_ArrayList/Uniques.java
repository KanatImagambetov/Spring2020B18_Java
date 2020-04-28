package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = 0;
            for (Integer each : list) {
                if (each == list.get(i)) {
                    num++;
                }
            }
            if (num == 1) {
                uniques.add(list.get(i));
            }
        }
        System.out.println(uniques);
    }
}
