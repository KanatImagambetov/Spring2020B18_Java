package day20_Arrays;

import java.util.Arrays;

public class additionArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={4,5,6,7,8,9,0,4,5,6,7};

        int[] arr3=new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(arr3));

        for(int i=0; i<arr1.length; i++){
            arr3[i]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        for(int i=0; i<arr1.length; i++){
            arr1[i]=arr1[i]/2;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
