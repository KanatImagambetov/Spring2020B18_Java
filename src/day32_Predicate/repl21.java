package day32_Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class repl21 {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        double b=0.0;
        int b1=0;


        for(int i=0; i<deliveries.size();i++){
            b+=deliveries.get(i);
            b1+=deliveries.get(i);
        }
        double c1=b/max_fuel;
        int c=b1/max_fuel;

        int c2=0;

        if(c==c1){
            c2+=c;
        }else{
            c2+=c+1;
        }
        return c2;
    }

    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5
    }//end main
}
