package Office_hour_04152020;

import java.util.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        int a=100;
        int[] arr={100,200,300};

        System.out.println(arr[1]);
        for( int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        System.out.println("=================================");
        String[] names={"kanat","madima","kairat","osan","poiuy"};
        String[] names1=new String[names.length];
        int j=0;

        for(int i=names.length-1; i>=0; i--){
            names1[i]=names[j];
            j++;
        }

        System.out.println(Arrays.toString(names1));

    }
}
