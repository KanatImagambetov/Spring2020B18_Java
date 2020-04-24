package day22_ArraysLoop;

import java.util.Arrays;

public class DesendingOrder {
    public static void main(String[] args) {
        int[] arr={1,-2,3,-4,5,-6,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1=new int[arr.length];

        int j=arr.length-1;

        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
