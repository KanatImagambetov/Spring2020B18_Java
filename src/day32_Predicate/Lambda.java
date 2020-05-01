package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Predicate<Integer> odd=y->y%2!=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(odd);

        System.out.println(list);
        System.out.println("=========================================================");

        Predicate<Integer> rev=y->y<5;
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.removeIf(rev);
        System.out.println(list1);
        System.out.println("=========================================================");

        Predicate<String> rev1=y->y.toLowerCase().startsWith("m");
        ArrayList<String> str=new ArrayList<>();
        str.addAll(Arrays.asList("Mjuh","Kanat","MdFdm","mfgfmll","gdDDF"));
        str.removeIf(rev1);
        System.out.println(str);
        System.out.println("=========================================================");

        Predicate<String> rev2=y->y.toLowerCase().startsWith("m")||y.toLowerCase().startsWith("g");
        ArrayList<String> str1=new ArrayList<>();
        str1.addAll(Arrays.asList("Mjuh","Kanat","MdFdm","mfgfmll","gdDDF"));
        str1.removeIf(rev2);
        System.out.println(str1);
        System.out.println("=========================================================");

 //       Predicate<Character> rev3=y->y>=48&&y<=57;
        Predicate<Character> rev3=y->Character.isDigit(y);

        ArrayList<Character> str3=new ArrayList<>();
        str3.addAll(Arrays.asList('a','d','3','w','4','y'));
        str3.removeIf(rev3);
        System.out.println(str3);

        System.out.println("=========================================================");

        ArrayList<Integer> a=new ArrayList<>();
        a.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        a.removeIf(p->p<5);
        System.out.println(a);

        System.out.println("=========================================================");

        ArrayList<Integer> a1=new ArrayList<>();
        a1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,9,15,30));
        a1.removeIf(p->p%5==0&&p%3==0);
        System.out.println(a1);

        System.out.println("========================================================");

        ArrayList<Character> str4=new ArrayList<>();
        str4.addAll(Arrays.asList('a','%','+','w','4','y'));
        str4.removeIf(y->y>=33&&y<=47||y>=58&&y<=64);
        System.out.println(str4);
    }
}
