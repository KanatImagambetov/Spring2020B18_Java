package Practive_04_01_2020;

public class class01 {
    public static void main(String[] args) {
        String str="Java";
        char ch1=str.charAt(3);

        System.out.println(ch1);

//        char ch2=str.charAt(-1);
 //       System.out.println(ch2);
        String a="Cybertek School";
//        int b=a.length()-1;
//        System.out.println(b);
//        int maxindex=b-1;
//        char m=a.charAt(maxindex);

        System.out.println(a.charAt(a.length()-1));

        String l="Cybertek";
        l=l.concat(" School");

        System.out.println(l);

        String n1="kANAT";
        n1=n1.substring(0,1).toUpperCase()+n1.substring(1).toLowerCase();

        System.out.println(n1);

        String n2="  Cybertek School          ";
        System.out.println(n2.substring(9));
        System.out.println(n2);
        String n3=n2.trim();
        System.out.println(n3);
        System.out.println(n2.length());
        System.out.println(n3.length());

        String z1=n3.substring(9);
        System.out.println(z1);

        String sent1="I like to learn Java";
        String sent2=sent1.substring(2,6);

        System.out.println(sent2);

        String d1="I like Java and only I see Java moreover Java";

        String d2=d1.replace("Java", "C+");
        String d3=d1.replaceFirst("Java","C+");
        System.out.println(d2);
        System.out.println(d3);

        int f1=d1.indexOf("Java");
        int f2=d1.lastIndexOf("Java");
        System.out.println(f1);
        System.out.println(f2);





    }

}
