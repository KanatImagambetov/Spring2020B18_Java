package day36_StaticBlock;

public class repl3 {
    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }

    public static int commonDivisor(int m, int n) {
        int k=0;
        if (m > n) {
            for (int i = n; i >= 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    k=i;
                    break;
                }
            }
        }else{
            for (int i = m; i >= 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    k=i;
                    break;
                }
            }
        }
        return k;
     }
}

