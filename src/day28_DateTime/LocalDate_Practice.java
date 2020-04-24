package day28_DateTime;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalDate_Practice {
    public static void main(String[] args) {
        String[] friends={"John","Aaron", "Daniel"};
        LocalDate johnbd=LocalDate.of(2020,3,5);
        LocalDate aaronbd=LocalDate.of(2000,3,5);
        LocalDate danielbd=LocalDate.of(2010,5,15);
        LocalDate[] bds={johnbd,aaronbd,danielbd};

//        System.out.println(Arrays.toString(bds));
        for(int i=0; i<friends.length; i++){
            String name=friends[i];
            LocalDate bd=bds[i];
            System.out.println(name+"'s birthday is "+bd);
        }

        int a=100;
        int b=200;
        int c=300;
        int[] array={a,b,c};

    }
}
