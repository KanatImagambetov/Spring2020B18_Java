package day24_Methods;
import Resources.Library;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str="Cybertek";

        String str1="Kanat";
        String revstr1=Library.reverse1(str1);
        System.out.println(revstr1);


        String revstr=Library.reverse1(str);
        System.out.println(revstr);
        System.out.println(str.equalsIgnoreCase(revstr));

        int[] arr={1000,222,11,1,11111,3333,222,33444,3,2};

        arr=return_Desender.sortDesend(arr);
        System.out.println(Arrays.toString(arr));

    }
}
