package day07_ifstatement;

public class medianenumber {
    public static void main(String[] args) {
        double  a=100;
        double  b=200;
        double  c=300;

        boolean amed=(a<b && a>c) || (a>b&&a<c);
        boolean bmed=(b<a && b>c) || (b>a&&b<c);
        boolean cmed=(c<b && c>a) || (c>b&&c<a);

        if (amed) {
            System.out.println(a + " is med");
        }
        if (bmed) {
            System.out.println(b + " is med");
        }
        if (cmed) {
            System.out.println(c + " is med");

        }

        int age=20;

        if(age>=21) {
            System.out.println("here is your vodka");
        }else {
            System.out.println("go home kid");
        }







    }


}
