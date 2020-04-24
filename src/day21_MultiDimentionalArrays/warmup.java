package day21_MultiDimentionalArrays;

import java.text.DecimalFormat;

public class warmup {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        int[] arr={10,20,30,40,50,60,40,20,90,2,3};
        int sum=0;

        for(int i=0;i<=arr.length-1; i++){
            sum+=arr[i];
        }
        System.out.println(df.format(sum/(double)arr.length));
    }
}
