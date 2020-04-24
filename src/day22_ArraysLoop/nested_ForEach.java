package day22_ArraysLoop;

import java.util.Arrays;

public class nested_ForEach {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        for(int each: arr){
            System.out.print(each+" ");
        }
        System.out.println("\n=========================================");
        int[][] arr2D={{1,2,3},{4,5,6}};
        for(int[] each1D: arr2D){
            System.out.println(Arrays.toString(each1D));
        }
        System.out.println("\n=========================================");
        int[][] arr2D1={{1,2,3},{4,5,6}};
        for(int[] each1D: arr2D1){
            for(int each1D2: each1D) {
                System.out.print(each1D2+" ");
            }
        }
        System.out.println("\n=========================================");
        char[][] ch2D={{'A','B'},{'C','D','E'},{'F','J','H'}};
        for(char[] each:ch2D){
            System.out.println(Arrays.toString(each));
        }

    }
}
