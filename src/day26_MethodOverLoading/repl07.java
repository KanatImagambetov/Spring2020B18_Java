package day26_MethodOverLoading;

import java.util.Scanner;

public class repl07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        int[] number={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144};
        int res=number[num];
        System.out.println(res);

    }
}
