package day25_MethodsRecap;

public class return_methods {
    public static int max(int a, int b) {
        int max=0;
        if(a>=b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }

    public static int max2(int a, int b) {
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        int r=max(2,5);
        System.out.println(r);

        int r1=max2(2,5);
        System.out.println(r1);
    }
}
