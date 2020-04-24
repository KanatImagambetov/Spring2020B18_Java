package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Java";

        char[] chars=name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[3]);

        String str="I like Java";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        String sentence="Today is great day";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String res="";

        for(int i=words.length-1; i>=0; i--){
            String eachwords=words[i];
 //           System.out.print(eachwords+" ");
            res+=eachwords+" ";
        }
        System.out.println(res);

        String str2="ABCDEF";
        String[] words2=str2.split("");
        char[] ch2=str2.toCharArray();
        System.out.println(Arrays.toString(words2));
        System.out.println(Arrays.toString(ch2));


        int[] num1=new int[3];
        System.out.println(Arrays.toString(num1));
        int[] num2={1,2,3,4,5};
        num1=num2;
        System.out.println(Arrays.toString(num1));
        for(int i=0; i<num1.length;i++){
            System.out.print(num1[i]);
        }







    }
}
