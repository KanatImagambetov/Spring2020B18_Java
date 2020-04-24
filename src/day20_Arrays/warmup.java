package day20_Arrays;

public class warmup {
    public static void main(String[] args){
        int[] num={1000, 10000, -201231, -4, 9, 8};

//        int max=-999999999;
//        int min=999999999;
        int min=num[0];
        int max=num[0];
//        int last=num.length-1;


        for(int i=0; i<=num.length-1; i++){
            if(max<=num[i]){
                max=num[i];
            }
            if(min>=num[i]){
                min=num[i];
            }

        }

        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);

    }
}
