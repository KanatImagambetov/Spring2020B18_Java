package day29_Wrapper_ArrayList;
import day19_Arrays.Arrays;

import java.lang.reflect.Array;

public class ValueOfMethod {
    public static void main(String[] args) {
        String str = "123";
        Integer a=Integer.valueOf(str);

        System.out.println(a+1);

        String r1="truE";
        boolean a1=Boolean.valueOf(r1);
        System.out.println(r1);
        Boolean a2=Boolean.valueOf(r1);
        System.out.println(a2);

        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);
        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum=Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3=Byte.MAX_VALUE;
        System.out.println(maxNum3);
        byte minNum1=Byte.MIN_VALUE;
        System.out.println(minNum1);

        //=============================================================
        boolean[] arr=new boolean[3];



    }
}
