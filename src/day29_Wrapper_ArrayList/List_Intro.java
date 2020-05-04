package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<Integer>();

        scores.add(10);
        scores.add(20);
        scores.add(30);
        scores.add(40);
        System.out.println(scores);

        Integer a=scores.get(2);
        int a1=scores.get(2);
        double a2=scores.get(2);

        System.out.println(a);
        System.out.println(a1);

    }
}
