package day35_Static;

public class staticVariables {
    int a2=200;//instance
    static int a3=300;//static
    public static void main(String[] args) {
        int a1=100;//local variable
        staticVariables ob1=new staticVariables();
        ob1.a2=1000;
        ob1.a3=4000;
        staticVariables ob2=new staticVariables();
        ob2.a2=2000;
        ob2.a3=5000;

        System.out.println(ob1.a2);
        System.out.println(ob2.a2);

        System.out.println(ob1.a3);
        System.out.println(ob2.a3);

    }
}
