package day30_ArrayList;

import java.util.Arrays;

public class warmup {
    public static void main(String[] args) {
        String str="a1b7c3";
        char[] arr=str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum=0;
        for(char each: arr){
//1            boolean isDigit=each>=48&& each<=57;
//1            if(isDigit){
//2            if(each>=48&& each<=57){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
        boolean a=Character.isAlphabetic('A');
    }
}
