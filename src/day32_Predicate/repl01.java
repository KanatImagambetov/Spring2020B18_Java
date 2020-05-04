package day32_Predicate;

import java.util.Arrays;

public class repl01 {

    public static void main(String[] args) {
        int[] arr={8,3,4};
        boolean a=isSort(arr);
        System.out.println(a);

    }
    public static boolean isSort(int[] nums){
        int[] arr3=new int[nums.length];
        for(int i=0; i<arr3.length; i++){
            arr3[i]=nums[i];
        }
        Arrays.sort(nums);
        boolean res1= Arrays.equals(arr3, nums);
        return res1;
    }


}

