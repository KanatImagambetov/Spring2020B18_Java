package day22_ArraysLoop;

public class NestedForEachPractice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
int count=0;
int sumO=0;
int sumE=0;
        for(int[] each1D: numbers){
            for(int each:each1D) {
                if (each % 2 == 0) {
                System.out.print(each + " ");
                sumE+=each;
                   }else{
                    sumO+=each;
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(sumE);
        System.out.println(sumO);

        System.out.println(count);
    }
}
