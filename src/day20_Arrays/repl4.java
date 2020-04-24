package day20_Arrays;

public class repl4 {
    public static void main(String[] args) {
        int n=16;
        int res=1;
        for(int i=1; i<=n; i++){
            res*=i;
        }
        System.out.println(res);
    }
}
