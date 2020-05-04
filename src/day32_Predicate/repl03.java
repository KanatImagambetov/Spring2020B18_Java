package day32_Predicate;

public class repl03 {
    public static void main(String[] args) {
        int num1=3;
        int num2=11;

        String sum="";
        for(int i=num1;i<=num2; i++) {
            if (i % 2 != 0) {
                sum += i + " ";
            }
        }
        System.out.println(sum);

    }
}
