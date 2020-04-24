package day20_Arrays;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String r=Arrays.toString(arr);

        System.out.println(r);
        System.out.println(arr);

        String names[]={"Madi", "Kanat", "Osman"};
        System.out.println(Arrays.toString(names));

        double[] nom={10,40,59};
        System.out.println(Arrays.toString(nom));
        System.out.println(nom[0]+1);


    }
}
