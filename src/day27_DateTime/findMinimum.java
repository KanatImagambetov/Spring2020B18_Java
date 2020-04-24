package day27_DateTime;

public class findMinimum {
    public static void main(String[] args) {
        double[] arr={5,4.5,7,5.9,-9};
        System.out.println(minimum(arr));
        }

    public static int minimum(int[] arr) {
        int minimum=arr[0];
        for(int each:arr){
            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr) {
        double minimum=arr[0];
        for(double each:arr){
            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }
}
