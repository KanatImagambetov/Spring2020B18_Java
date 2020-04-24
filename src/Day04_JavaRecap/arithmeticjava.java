package Day04_JavaRecap;

public class arithmeticjava {
    public static void main(String[] args) {
        int a1=10/3;
        System.out.println(a1);
        System.out.println(10.0/4);
        double d=10/4;
        System.out.println(d);
        System.out.println(10.0/4.0);
      //  System.out.println();
        float f1=10/4f;
        System.out.println(f1);
        System.out.println(15%3);
        //odd number:
        //even number: evenly divisible by 2==>0
        boolean evennumber=25%2==0;
        System.out.println(evennumber);
        boolean even=22%2!=0;

        System.out.println(even);
        System.out.println(10%2==0);
        System.out.println(10%2!=0);

        System.out.println("10 is even number: " + (10%2==0));
        System.out.println("11 is even number: " + (11%2==0));
        System.out.println("25 is odd number: " + (25%2!=0));
        System.out.println("25 is odd number: " + !(25%2!=0));
    }



}
