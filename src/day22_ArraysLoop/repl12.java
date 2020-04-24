package day22_ArraysLoop;

import java.util.Arrays;

public class repl12 {
    public static void main(String[] args) {
        int[] binary={0,0,1,0,0,0,1,1};

        int[] binary1={128,64,32,16,8,4,2,1};
        int sum=0;

        for(int i=0;i<=binary.length-1;i++){
            binary[i]=binary[i]*binary1[i];
            sum+=binary[i];
        }
        System.out.println(Arrays.toString(binary));
        System.out.println(sum);
    }
}
