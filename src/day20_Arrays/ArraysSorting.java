package day20_Arrays;

import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
       int[] arr1={9,7,6,4,3,5,6,7,100,8,7};

       Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("Minimum number: "+arr1[0]);
        System.out.println("Maximum number: "+arr1[arr1.length-1]);

        char[] ch={'z', 'a', 'g', 'k', 'w'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] names={"Deniz", "Osman", "Rustem", "Ali", "AWnna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        //===============================================
        int[] arr2={9,7,6,4,3,5,6,7,100,8,7, 0, -4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3=new int[arr2.length];

        int j=0;

        for(int i=arr2.length-1; i>=0; i--){
            arr3[j]=arr2[i];
            j++;
          }
        System.out.println(Arrays.toString(arr3));
    }
}
