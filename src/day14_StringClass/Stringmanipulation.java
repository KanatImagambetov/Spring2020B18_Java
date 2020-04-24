package day14_StringClass;

public class Stringmanipulation {
    public static void main(String[] args) {
        String m1="I like to learn Java. I like to watch movie Jumanji";
        //         0123456789

        int m=m1.indexOf("I");

        System.out.println(m);

        String s="I like Java, and I like reading";

        int s1=s.lastIndexOf("l");

        System.out.println(s1);

        String x="I like Java Java Java";
        int d=x.indexOf("e Java")+2;

        System.out.println(d);

        int d1=x.lastIndexOf("Java");
        System.out.println(d1);

        char v=x.charAt(20);
        System.out.println(v);








    }

}
