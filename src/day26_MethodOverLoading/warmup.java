package day26_MethodOverLoading;

import java.util.Arrays;

public class warmup {
    public static void main(String[] args) {
        String str="AAA";
        char ch='A';
        char[] arr=str.toCharArray();
        int count=0;
        for(int each: arr){
            if(each==ch){
                count++;
            }
        }
        System.out.println(count);

        String str2="AASSSSSSDDDDDFFFBBBBBBBBBFFAAA";
        char ch2='B';
        int num=frequency(str2,ch2);
        System.out.println(num);

    }

    public static int frequency(String str, char ch) {
        char[] arr=str.toCharArray();
        int count=0;
        for(int each: arr){
            if(each==ch){
                count++;
            }
        }
        return count;
    }
}
