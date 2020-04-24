package day22_ArraysLoop;

public class repl04 {
    public static void main(String[] args) {
        double[] temps={80, 93.2,86.1,34.8};
        int k = 0;
        double total = 0;
        double avgTemp = 0;

        for(double each: temps){
            total+=each;
            k++;
        }
        avgTemp=total/k;
        System.out.println(avgTemp);
    }
}
