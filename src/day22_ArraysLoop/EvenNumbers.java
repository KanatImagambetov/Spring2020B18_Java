package day22_ArraysLoop;

import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[200]; // index: 0 ~ 99,
         for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = i+1;  // assigning 1~ 100
        }
        System.out.println(Arrays.toString(numbers) );
        for( int each :  numbers ){
            if( each % 2 !=0 ) {
                continue;
            }
            System.out.print(each + " ");
        }
    }
}