package day23_methods;

import java.util.Arrays;
import java.util.Scanner;

public class repl03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<=size-1;i++){
            arr[i]=input.nextInt();
        }
        plus_minus(arr);

    }

    public static void plus_minus(int[] num){
        int pos=0;
        int neg=0;
        int zero=0;

        for(int j=0;j<=num.length-1;j++){
            if(num[j]<0){
                neg++;
            }else if(num[j]>0){
                pos++;
            }else if(num[j]==0){
                zero++;
            }
        }
        System.out.println("positives:"+pos+", negatives:"+neg+", zeros:"+zero);
    }
}
