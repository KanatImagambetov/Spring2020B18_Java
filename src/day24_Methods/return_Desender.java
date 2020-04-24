package day24_Methods;

import java.util.Arrays;

public class return_Desender {
    public static void main(String[] args) {
        int[] arr1={1,23,34,2,545,332};
        int[] arr2={56,767,34,23,1,67,88};
        int[] arr3={7667,443,334,12,9,0};
        arr1=sortDesend(arr1);
        System.out.println(Arrays.toString(arr1));

        arr2=sortDesend(arr2);
        System.out.println(Arrays.toString(arr2));

        arr3=sortDesend(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] sortDesend(int[] arrays) {
        Arrays.sort(arrays);
        int[] reverArr=new int[arrays.length];
        int i=arrays.length-1;
        for(int j=0;j<=arrays.length-1;j++) {
             reverArr[j]= arrays[i];
             i--;
        }
   //     System.out.println(Arrays.toString(reverArr));
         return reverArr;
    }
}
