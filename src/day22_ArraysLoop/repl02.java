package day22_ArraysLoop;

import java.util.Arrays;

public class repl02 {
    public static void main(String[] args) {
        int[] numbers = new int[80]; // index: 0 ~ 99,
        for(int i =0; i<numbers.length; i++ ){
            numbers[i] = numbers.length-i;  // assigning 1~ 100
        }
        for( int each :  numbers ){
            if( each % 2 !=0 || each <20) {
                continue;
            }
            System.out.print(each + " ");
        }
    }
}