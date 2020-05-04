package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[] arr1D={1,2,3};
        System.out.println(Arrays.toString(arr1D));

        int[][] arr2D={{1,2,3},{4,5,6}};
        int a1=arr2D[0].length;
        int a2=arr2D[1].length;
        int[] a3 = new int[a1+a2];
        System.out.println(Arrays.toString(a3));

        for(int i=0; i<=a1-1; i++){
            a3[i]=arr2D[0][i];
        }
        for(int i=a1; i<=a3.length-1; i++){
            a3[i]=arr2D[1][i-a1];
        }
        System.out.println(Arrays.toString(a3));



        System.out.println(Arrays.deepToString(arr2D));

        int[][][] arr3D={  {{1,2,3},{4,5,6}} , {{7,8,9},{10,11,12}} };
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[0][1]));
        System.out.println(arr3D[1][1][0]);
    }
}
