package day08_ifstatement;

public class equalnumber {
    public static void main(String[] args) {
        double n1= 100.5;
        double n2=10.5;
        double n3=1000.5;

        boolean n1eqn2= n1==n2 && n1!=n3;
        boolean n1eqn3= n1==n3 && n1!=n2;
        boolean n2eqn3= n2==n3 && n2!=n1;
        boolean alleq= n2==n1 && n2==n3;
        boolean noneeq= n2!=n1 && n2!=n3 && n1!=n3;

        if(n1eqn2) {
            System.out.println("n1 is equal to n2");
        }
        if(n1eqn3) {
            System.out.println("n1=n3");
        }
        if(n2eqn3) {
            System.out.println("n2=n3");
        }
        if(alleq) {
            System.out.println("all are equal");
        }
        else {
            System.out.println("none" + " is equal");
        }
    }



}
