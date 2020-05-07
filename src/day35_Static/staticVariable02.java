package day35_Static;

public class staticVariable02 {
    int insVariable;
    static int staticVariables;
    public static void main(String[] args) {
        staticVariable02 o1=new staticVariable02();
        o1.insVariable=300;
        o1.staticVariables=400;
        staticVariable02 o2=new staticVariable02();
//        o1.insVariable=300;
        System.out.println(o1.insVariable);
        System.out.println(o2.insVariable);
        System.out.println("===========================");
        System.out.println(o1.staticVariables);
        System.out.println(o2.staticVariables);
        System.out.println(o1.insVariable);
        System.out.println(o2.insVariable);

        System.out.println(staticVariable02.staticVariables);


    }
}
