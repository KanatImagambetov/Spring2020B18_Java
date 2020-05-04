package day33_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Extract_char1 {
    public static void main(String[] args) {
        String str="ABCD123$%#456EFD!";
        char[] a=str.toCharArray();
        System.out.println(a);

        Character[] ch=new Character[a.length];
        for(int i=0; i<a.length;i++){
            ch[i]=a[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letter=new ArrayList<>(Arrays.asList(ch));
        letter.removeIf(p->!Character.isLetter(p));
        System.out.println(letter);
        ArrayList<Character> digit=new ArrayList<>(Arrays.asList(ch));
        digit.removeIf(p->!Character.isDigit(p));
        System.out.println(digit);

        ArrayList<Character> specialChar=new ArrayList<>(Arrays.asList(ch));
        specialChar.removeIf(p->Character.isDigit(p)||Character.isLetter(p));

        System.out.println(specialChar);

        ArrayList<Character> letters=new ArrayList<>();
        ArrayList<Character> digits=new ArrayList<>();
        ArrayList<Character> specialChars=new ArrayList<>();


    }
}
