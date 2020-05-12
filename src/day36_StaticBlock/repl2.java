package day36_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class repl2 {
    public static void main(String[] args) {
        int[] a={4,3,2,1,0,-1};
        System.out.println(Arrays.toString(do_switch(a)));
    }
    public static int[] do_switch(int[] i){
        int count=i.length;
        int k=0;
        int[] a1=new int[count];
        for (int j=count-1; j>=0;j--){
            a1[j]=i[k];
            k++;
        }
        return a1;
    }
}
