package day20_Arrays;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] arr={1,3,4};
        int[] arr1={1,3,4};
        boolean res= Arrays.equals(arr, arr1);

        System.out.println(res);
        int[] arr2={1,3,4};
        int[] arr3={4,3,1};
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        boolean res1= Arrays.equals(arr2, arr3);

        System.out.println(res1);


        int[] arr4={1,3,4};
        int[] arr5={4,3,1,6};
        Arrays.sort(arr4);
        Arrays.sort(arr5);
        boolean res2= Arrays.equals(arr4, arr5);

        System.out.println(res2);

    }
}
