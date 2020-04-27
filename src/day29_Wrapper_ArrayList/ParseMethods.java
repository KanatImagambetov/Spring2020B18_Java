package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str="123";

        int a1=Integer.parseInt(str);
        System.out.println(str+1);
        System.out.println(a1+1);
        boolean a=str.equals(a1);
        System.out.println(a);

        byte s=Byte.parseByte(str);
        System.out.println(s);

        Integer b9=(int)Byte.parseByte(str);

        String str3="11.9";
        float j=Float.parseFloat(str3);
        System.out.println(j+1);
        double k=Double.parseDouble(str3);

        System.out.println(k);
        String o="999999999";
        int o7=Integer.parseInt(o);
        System.out.println(o7+1);

        String g="true";
        boolean a6=Boolean.parseBoolean(g);
        System.out.println(!a6);

        String g21="tRUE";
        boolean a68=Boolean.parseBoolean(g21);
        System.out.println(a68);

    }
}
