package day22_ArraysLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String scan[]=new String[5];
        for(int i=0;i<=scan.length-1;i++){
            scan[i]=input.next();
        }
        System.out.println(Arrays.toString(scan));

        for(String each:scan){
            String str=each.substring(0,2);
            System.out.print(str+" ");

        }

    }
}
