package day36_StaticBlock;
import day34_CustomClass.Tester;
public class staticBlock {
    static String name;
    static int num;
    static Tester tester1;
    static{
        name = "Muhtar";
        num = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("Jean",123,"SDET", 12000);
    }
//    static Tester tester1=new Tester();
}
