package day15_loop;

public class Reverse {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "java";
        String rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        String rev1=str.substring(3,4)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

        System.out.println(" "+str1==str);

        String a=" ";
        a.trim();

        boolean A=a.isEmpty();
        System.out.println(a);
        System.out.println(A);





    }


}
