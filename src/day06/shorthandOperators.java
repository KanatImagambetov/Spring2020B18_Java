package day06;

public class shorthandOperators {
    public static void main(String[] args) {
        int a=2;
        a*=3;

        System.out.println(a);
        int b= a*=10;

        System.out.println(b);
        System.out.println(a);

        int a1=100;
        int b1= (a1*=2)   +   ++a1;
        System.out.println(b1);

        int x1=10;
        int y=x1+=10*2;
        System.out.println(y);

        int num3=300;
            num3 %=10 + 20;
        System.out.println(num3);

        int n1=400;
        n1%=3*5;

        System.out.println(n1);
float num2=400;
num2/=20+10;
        System.out.println(num2);


    }



}
