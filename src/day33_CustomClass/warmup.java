package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmup {
    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        input.addAll(Arrays.asList(1,1,2,2,3,4,5,6,6));
        input.removeIf(p->Collections.frequency(input,p)>1);

        System.out.println(input);
    }
}
