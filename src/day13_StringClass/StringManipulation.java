package day13_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str="Cybertek";
        //          01234567
        char a1=str.charAt(5);
        int a2=str.length();

        System.out.println(a1=='t');
        System.out.println(a1=='T');
        System.out.println(a2);
        System.out.println(a2>100);
//        System.out.println(a1=="t");

        String a3="Today is great day, java is fun";

        int a4=a3.length();

        System.out.println(a4-1);

        String b1="Cybertek";
        String b2=b1.concat(" School");
        System.out.println(b2);

        String c1="Java";
        System.out.println(c1.concat(" is a programming language"));
        System.out.println(c1);

        c1=c1.concat(" is a programming language");
        System.out.println(c1);

        String r1="Java is fun";
        r1=r1.concat(", and it is easy");

        System.out.println(r1);

        String name="CYBERTEK";

        name=name.toLowerCase();

        System.out.println(name);

        name=name.toUpperCase();
        System.out.println(name);

        String A1="   Today is a great day";
        A1=A1.trim();

        System.out.println(A1);

        String m1="Cybertek School is the best";
        String school=m1.substring(0,8);
        System.out.println(school);

        String fullname="Kuzzat Altay";
        String fname=fullname.substring(0,6);
        String lname=fullname.substring(7,12);
        int li=fullname.length();

        System.out.println("fkkk"+li);

        System.out.println(fname);
        System.out.println(lname);

        String name2="Murtafa Nazeeri";

        String name3=name2.substring(0,7);
        String name4=name2.substring(8,15);

        System.out.println(name3);
        System.out.println(name4);

        String gmail=name4.concat("_").concat(name3).concat("@gmail.com");
//        String gmail=

        System.out.println(gmail);

        String n2="I like C@ Programming";

        n2=n2.replace("C@","Java");

        System.out.println(n2);

        String m2="COVID 18";
        m2=m2.replace("18","19");

        System.out.println(m2);

        String z1="I like C@, C@ is fun, C@ is cool";

        z1=z1.replace("C@","Java");

        System.out.println(z1);

        z1=z1.replaceFirst("Java","C@");

        System.out.println(z1);



    }



}
