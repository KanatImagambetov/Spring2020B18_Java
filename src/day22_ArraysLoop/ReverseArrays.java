package day22_ArraysLoop;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,12};
        int[] arr1=new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            arr1[arr.length-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));

        for(int i=arr.length-1; i>=0; i--){
            int eachnum=arr[i];
            System.out.print(eachnum+" ");
        }

    }
}
