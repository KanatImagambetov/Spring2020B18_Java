package day26_MethodOverLoading;

import java.util.Arrays;

public class repl02 {
    public static String words(String one, String two) {
        int count=0;
        String str1="";

        if(one.length()>two.length()){
            count+=two.length();
            str1+=one.substring(two.length());
        }else{
            count+=one.length();
            str1+=two.substring(one.length());
        }
        String str="";
        String[] a1=one.split("");
        String[] b1=two.split("");
        for(int i=0;i<=count-1; i++){
            str+=a1[i]+b1[i];
        }
        return str+str1;
    }
    public static void main(String[] args) {
        String f=words("one", "four");
        System.out.println(f);
    }
}
