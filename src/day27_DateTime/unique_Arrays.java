package day27_DateTime;
import Resources.Library;
public class unique_Arrays {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,2,8};
        for(int each2:arr){
            int count=0;
            for(int each:arr){
                if(each==each2){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each2);
            }
        }
        double[] arr3={1.2,3,5,3.4,3.4,3,5,0,7.99,0};
        uniqueElements(arr3);

    }

    public static void uniqueElements(int[] arr) {
        for(int each2:arr){
            int count=0;
            for(int each:arr){
                if(each==each2){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each2);
            }
        }
    }
    public static void uniqueElements(double[] arr) {
        for(double each2:arr){
            int count=0;
            for(double each:arr){
                if(each==each2){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each2);
            }
        }
    }

    }

