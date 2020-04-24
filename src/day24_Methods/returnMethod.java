package day24_Methods;

public class returnMethod {
    public static void maxN(int a, int b) {
        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
//        maxN(10,20);
        int result=Addition(10,20);
        System.out.println(result);

        int res1=result+2000;
        System.out.println(res1);

    }

    public static int Addition(int a, int b) {
//        System.out.println(a+b);
        return a+b;
    }



}
