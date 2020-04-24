package day22_ArraysLoop;

import java.util.Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {
        int[][] nums={{9,8,7},{6},{5,4,3,2,1,0}};
        int num1=nums[0][1];

        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums[j].length;i++){
                System.out.print(nums[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("========================");

        for(int k=nums.length-1; k>=0; k--){
            for(int i=nums[k].length-1; i>=0; i--){
                System.out.print(nums[k][i]+" ");
            }
//            System.out.println();
        }






    }
}
