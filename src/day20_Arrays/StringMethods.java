package day20_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Mukhtar ";
        char[] ch=name.toCharArray();

        System.out.println(Arrays.toString(ch));


        String str1="Cybertek School";
        String str2="School Cybertek";
        char[] ch1=str1.toCharArray();
        Arrays.sort(ch1);
        System.out.println(ch1);
        System.out.println(Arrays.toString(ch1));

        char[] ch2=str2.toCharArray();
        Arrays.sort(ch2);

        boolean res1= Arrays.equals(ch1, ch2);

        System.out.println(res1);


    }
}
