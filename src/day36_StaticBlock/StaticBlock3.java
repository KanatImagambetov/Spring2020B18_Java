package day36_StaticBlock;
import day34_CustomClass.Tester;

public class StaticBlock3 {
    static String name;
    static int num;

    static Tester tester1=new Tester();
static{
    name="Mukhtar";
    num=100;
    tester1=new Tester();
    tester1.setTesterInfo("ean",1231, "sds",121323);
}

    public static void main(String[] args) {
        name="Mukhtar";
        num=200;
        System.out.println(name+num);
    }
}
