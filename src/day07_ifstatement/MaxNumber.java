package day07_ifstatement;

public class MaxNumber {
    public static void main(String[] args) {
        double a1=100;
        double b1=200;
        double c1=300.5;

        boolean agreater=a1>b1&&a1>c1; //if a is greater than both b and c, it is a greater
        boolean bgreater=b1>a1&&b1>c1; //if a is greater than both b and c, it is a greater
        boolean cgreater=c1>a1&&c1>b1; //if a is greater than both b and c, it is a greater

        if(agreater) {
            System.out.println(a1 + " is greater");
        }
        if (bgreater) {
            System.out.println(b1 + " is greater");
        }
        if (cgreater) {
            System.out.println(c1 + " is greater");
        }
    }


}
