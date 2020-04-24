package day25_MethodsRecap;

import java.util.Arrays;

public class fk {
    public static int count(String[] arr, String t) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].equals(t)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] sentence={"osan", "osan", "osan", "osan"};
        String a="osan";
        int g=count(sentence, a);
        System.out.println(g);

    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        boolean a=(toBe==true||notToBe==true);
        return a;
    }
}
