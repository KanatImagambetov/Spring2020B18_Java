package day28_DateTime;

import java.util.Arrays;

public class repl02 {
    public static void main(String[] args) {
        boolean a=isError("rrorfoo bar");
        System.out.println(a);
    }
    public static boolean isError(String line){
        String b=line.toLowerCase();
        boolean arr=b.contains("error")==(true);
        return arr;
    }
}
