package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[][] arr2D={ {1,2,3},{4,5,6,7}};

        System.out.println(arr2D.length);
        int[] arr1D=arr2D[1];
        System.out.println(Arrays.toString(arr1D));
        int num1=arr2D[1] [3];
        System.out.println(num1);

        char[][] ch2D={{'A','B','C'},{'D','E','F'},{'G','J','H'}};
        char chD=ch2D[1][0];
        char[] chGHJ=ch2D[2];

        System.out.println(chD);
        System.out.println(Arrays.toString(chGHJ));

        String[][] str2D={{"A","B","C"},{"D","E","F"},{"G","J","H"}};
        String str1=str2D[2][1];
        System.out.println(str1);
    }
}
