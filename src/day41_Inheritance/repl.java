package day41_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class repl {
        public static void main(String[] args) {
            int[][] a = {{1,1,2}, {3,1,2}, {3,5,3}, {0,1,2}};
            int[] sums = rowSums(a);
            for(int sum : sums)
                System.out.print(sums);
        }
        public static int[] rowSums(int[][] nums){
            int[] total=new int[nums.length];
            for(int j=0;j<nums.length;j++){
                int sum=0;
                for(int i=0;i<nums[j].length;i++){
                         sum+=nums[j][i];
                         total[j]=sum;
                }
            }
            return total;
        }

    }
