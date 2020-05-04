package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class repl17 {
    public static void main(String[] args) {
        String[] a={"KAnat","saule","madina"};
        String[] b=reverse(a);
        System.out.println(Arrays.toString(b));

    }
    public static String[] reverse(String[] arr) {
        String[] arr1=new String[arr.length];
        int j=0;
        for(int i=arr1.length-1;i>=0;i--){
            arr1[i]=arr[j];
            j++;
        }
        return arr1;
    }
}
