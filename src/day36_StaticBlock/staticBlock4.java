package day36_StaticBlock;
import day34_CustomClass.Tester;
public class staticBlock4 {
    static String name="Cybertek school";
    static Tester tester1=new Tester();
    int insVariable;
   // tester1.setTesterInfo("Mukhar",123,"SDET",120000);
    static{
        name ="Cybertek school";
        tester1.setTesterInfo("Mukhar",123,"SDET",120000);
       tester1.setTesterInfo("Kanat",223,"SDET",160000);
    }
    public static void main(String[] args) {
        System.out.println(name);
    }
}
