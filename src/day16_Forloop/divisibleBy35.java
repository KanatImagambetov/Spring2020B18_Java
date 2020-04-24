package day16_Forloop;

public class divisibleBy35 {
    public static void main(String[] args) {
        int cal=0;

        for(int i=1; i<=100; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
 //                   System.out.print(i+" ");
                    cal+=i;
                }
            }
        }
        System.out.println(cal);

    }



}
