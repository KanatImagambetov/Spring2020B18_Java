package day28_DateTime;

public class repl01 {
    public static String biggerS(String a ,String b) {
        int a1=a.length();
        int b1=b.length();
        String res="";
        if(a1>b1){
            res+=a1;
        }else{
            res+=b1;
        }
        return res;
    }
    public static void main(String[] args) {
            String t="longword";
            String t1="foo";
        String a=biggerS(t,t1);
        System.out.println(a);
    }

    public static int findMax(int[] arr) {
        int Max=0;

        for(int each: arr){
            if(each>Max){
                Max=each;
            }
        }
        return Max;
    }
    public static double findMax(double[] arr) {
        double Max=0.0;
        for(double each: arr){
            if(each>Max){
                Max=each;
            }
        }
        return Max;
    }
}
