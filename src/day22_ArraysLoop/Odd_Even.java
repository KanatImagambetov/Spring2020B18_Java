package day22_ArraysLoop;

import java.util.Arrays;

public class Odd_Even {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        int counOdd=0;
        int counEv=0;
        for(int count: arr){
            if(count%2==0){
                counEv++;
            }
            if(count%2!=0){
                counOdd++;
            }
        }
        System.out.println("number of Even is "+counEv);
        System.out.println("number of Odd is "+counOdd);
    }
}
