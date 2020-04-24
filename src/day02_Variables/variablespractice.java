package day02_Variables;

public class variablespractice {
    public static void main(String[] args) {
        /*
        salary
        taxrate
        ssn

         */
       // byte salary=127;
        int salary = 120000;
        double federaltax=0.18;
        float statetax=0.065f;

        double subtaxes=federaltax+statetax;
        double salaryaftertax=salary*(1-subtaxes);
        System.out.println(salaryaftertax);
        System.out.println("=======================================");

        //area of the circle=r*R*R
        double r=5.5;
        double area=r*r*3.14;
        System.out.println(area);
        System.out.println("=============================================");
        int kg=90;
        double pond=kg*2.25;
        System.out.println(pond);
        System.out.println("================================================");

        double lira=1000;
        double rate=2.2;
        double dollar=lira*rate;

        System.out.println(dollar);

        System.out.println("===================================================");
        double liter=30;
        double galon=3.0;
        double barrel=liter*galon;
        System.out.println(barrel);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");




    }
}
