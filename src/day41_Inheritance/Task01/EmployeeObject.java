package day41_Inheritance.Task01;

public class EmployeeObject {
    public static void main(String[] args) {
        Developer dev1=new Developer(120000,"Namik",123,"SDET",'M');
        dev1.fixingBug();
        System.out.println(dev1);

        Tester tester1=new Tester(1000, "Kanat",123,"SDET",'F');

        System.out.println(tester1);
        tester1.reporting();
        BusinessAnalyst BA1=new BusinessAnalyst(12334, "Kairat", 1233,"SDET",'F');
        BA1.writingReg();
        System.out.println(BA1);
    }
}
