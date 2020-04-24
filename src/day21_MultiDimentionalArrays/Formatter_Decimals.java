package day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class Formatter_Decimals {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");

        double a=10.0/2.9;
        System.out.println(a);
        System.out.println(df.format(a));

    }
}
