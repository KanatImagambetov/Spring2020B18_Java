package day19_Arrays;
import java.util.Arrays;
public class Arrays03 {
    public static void main(String[] args) {
        int[] arr={10, 20, 30};

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        arr=new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));


        String[] testers1=new String[3];//{"reem", "madina", "gulya", "marat"};

        testers1[0]="reem";
        testers1[1]="madina";
        testers1[2]="gulya";
//        testers1[3]="marat";
        System.out.println(testers1[0]);
        System.out.println(testers1[1]);
        System.out.println(testers1[2]);
        System.out.println(Arrays.toString(testers1));
//        System.out.println(testers1a[3]);
        System.out.println(testers1.length);

        System.out.println("============================================");

        String[] students=new String[10];
        // write

        }
}
