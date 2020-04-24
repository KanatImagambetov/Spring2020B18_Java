package day20_Arrays;

public class repl7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int count=0;

        for(int i=0; i<=arr.length-1;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
