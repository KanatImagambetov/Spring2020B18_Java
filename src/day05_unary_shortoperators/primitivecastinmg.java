package day05_unary_shortoperators;

public class primitivecastinmg {
    public static void main(String[] args) {
       // implicit casting done automatically

        int a=10;
        long b=a;
// b=10L, implicite casting is done automatically
//int c=b; b is long datatype

        int a1=10;
        long b1=(long)a1;//manually

        //int c1=b1; long is larger


        // explicit casting

        int tnum=100;
        byte itum=(byte)tnum;
        short snum=(byte)tnum;
        double dnum=5.5;
        float fnum=(float)dnum;


        System.out.println(fnum+1);


        float f1=60.5f;
        int i1=(int)f1;
        System.out.println(i1);

        long large=9999999999l;

        int in=(int)large;
        System.out.println(in);
        char ch1='a';
        short sh1=(short)ch1;
        System.out.println(sh1);


        int a2=50;
        a2=--a2 + a2++ + a2-- + a2++;
        System.out.println(a2);
        int n=1;
      //  n=-n-- + n++ / -n-- * --n;
        n=-n-- + n++ / -n-- * --n;
        System.out.println(n);

    }




}
