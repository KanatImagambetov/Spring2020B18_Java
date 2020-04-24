package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class repl01 {
    public static void main(String[] args) {
        int[] nums={1, 1, 2, 3, 4, 3, 4};
        Arrays.sort(nums);

        for(int i=0;i<=nums.length-1;i++){
            int count=0;
            for(int j=0;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }
    }
}
