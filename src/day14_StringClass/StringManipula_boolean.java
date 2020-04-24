package day14_StringClass;

public class StringManipula_boolean {
    public static void main(String[] args) {
        String s="";
        boolean b=s.isEmpty();

        System.out.println(b);

        String us="";
        if(us.isEmpty()){
            System.out.println("pld provide user name");
        }

        String s1="Cat";
        String s2=new String("Cat");
        String s3="Cat";

        System.out.println(s1==s2);
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));


    }

}
