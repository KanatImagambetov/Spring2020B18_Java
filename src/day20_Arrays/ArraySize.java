package day20_Arrays;

public class ArraySize {
    public static void main(String[] args) {

        int[] arr={1,2,3};

//        System.out.println(arr[100]);
        System.out.println(arr[2]);
        int[] num=new int[2];
        num[0]=10;
        num[1]=20;
        System.out.println(num[0]);
        num=new int[9];
        System.out.println(num[0]);
        System.out.println(num[8]);
    }
}
