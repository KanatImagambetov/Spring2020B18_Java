package day26_MethodOverLoading;

import java.util.Arrays;

public class Overloading2 {
    public static void sum2(int a, int b) {
        System.out.println(a+b);
    }
    public static void sum2(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    public static void sum2(int a, int b, int c, int d) {
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        sum2(1,2,3,4);
        sum2(1,2,3);
        sum2(1,2);
    }

}
