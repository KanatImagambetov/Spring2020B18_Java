package day06;

public class logicalOperators {
    public static void main(String[] args) {
        boolean r1=true;
        System.out.println(!r1);
        boolean r2=!(10+15>15);
        System.out.println(r2);

        boolean r3=!true==!false;

        System.out.println(r3);

        System.out.println(10==10 && 11==0);

        boolean r5="coronavirus"!="end of the world" && "coronavirus1"=="end of the world1";

        System.out.println(r5);

        boolean  r0=10>15 && 15<13;

        System.out.println(r0);

        boolean t1='a'=='b'-1 && 'b'+1=='c';
        System.out.println(t1);

        boolean t3= true||false;

        System.out.println(t3);

        boolean r6= true != false || false == !true ;
        System.out.println(r6);

        boolean  r9=10<15 && 15>13;

        System.out.println(r9);


    }



}
