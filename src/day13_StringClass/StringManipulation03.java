package day13_StringClass;

public class StringManipulation03 {
    public static void main(String[] args) {
        String str="I like Java programming";

        int num1= str.indexOf("Java");

        System.out.println(num1);

        String num2="Cybertek school is awesome";

        int num3=num2.indexOf("is")+1;

        System.out.println(num3);

        int max=num2.length();
        System.out.println(max);

        String names="Mukhtar";
        int a1=names.indexOf("Good Guy");

        System.out.println(a1);

        String fullname="Kuzzat Altay";
        String fname=fullname.substring(0, fullname.indexOf(" "));
        String lname=fullname.substring(fullname.indexOf(" ")+1 );

        System.out.println(fname);
        System.out.println(lname);


    }

}
