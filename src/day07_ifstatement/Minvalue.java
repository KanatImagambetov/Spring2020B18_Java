package day07_ifstatement;

public class Minvalue {

    public static void main(String[] args) {
        double a=1000.9;
        double b=3002.1;
        double c=200.234;

        boolean aless=a<b&&a<c;
        boolean bless=b<c&&b<a;
        boolean cless=c<a&&c<b;

        if (aless) {
            System.out.println(a + " is less");
        }
        if (bless) {
            System.out.println(b + " is less");
        }
        if (cless){
            System.out.println(c + " is less");
        }


    }
}
