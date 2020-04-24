package day26_MethodOverLoading;

import java.util.Arrays;
import java.util.Scanner;

public class repl05 {

    public static void add_to_r(int[] r,int n){
        //create new array with one more position.
        int[] arr1=new int[r.length+1];
        arr1[r.length]=n;
        for(int i=0; i<=r.length-1; i++){
         arr1[i]=r[i];
         }
        for(int each: arr1){
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
        }
        add_to_r(arr, n);
    }
}
