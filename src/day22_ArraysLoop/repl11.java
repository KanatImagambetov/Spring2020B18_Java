package day22_ArraysLoop;

import java.util.Arrays;

public class repl11 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};

        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        for (int j = 1; j <= 1000; j++) {
            int sum=0;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                sum+=inhabitants[i];
            }
            System.out.println("Day "+j+" "+ Arrays.toString(inhabitants));
            if(sum==0){
                System.out.println("---- EXTINCT ----");
                System.exit(0);
            }
        }
    }
}
