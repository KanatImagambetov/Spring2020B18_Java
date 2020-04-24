package day24_Methods;

import java.util.Arrays;

public class returnMethodPractice {
    public static int max(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int min(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr9={5,4,3,2,7,86,6,5,4};
        int max1=max(arr9);
        int min1=min(arr9);
        System.out.println(max1);
        System.out.println(min1);
    }
}
