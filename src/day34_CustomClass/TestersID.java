package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class TestersID {
    public static void main(String[] args) {
        Tester newTester1=new Tester();
        newTester1.setTesterInfo("Madina Imagak",1132332,"Developer",123455);
        Tester newTester2=new Tester();
        newTester2.setTesterInfo("KAirat Ismai",45465767,"QA engineer",177655);
        Tester newTester3=new Tester();
        newTester3.setTesterInfo("Guya Aubekerova",877655,"SDET engineer",227655);
        Tester newTester4=new Tester();
        newTester4.setTesterInfo("Dayana Imagambetova",10998549,"SDET engineer",127655);

        ArrayList<Tester> testers=new ArrayList<>();
        testers.addAll(Arrays.asList(newTester1,newTester2,newTester3,newTester4));

        testers.removeIf(p->p.jobTitle.contains("SDET"));
        int total=0;
        for(Tester each:testers){
            System.out.println(each.name);
            total+=each.salary;
         }
        System.out.println("$"+total);
    }

}
