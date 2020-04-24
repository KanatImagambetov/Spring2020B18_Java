package day26_MethodOverLoading;

public class Overloading3 {
    public static void main(String[] args) {
        sum(1,2);
        sum(1.3,2.6);

        double num1=sum(10, 15.4);
        System.out.println(num1);

        double num2=sum(25L, 30L);
        System.out.println(num2);

        sum((int)25L, (int)30L);

    }
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static double sum(double a, double b) {
        return a+b;
    }
}
