package day09_Nested_Ternary;

public class ternary_practice2 {
    public static void main(String[] args) {
        int num1=800;
        int num2=200;
        int min=(num1<num2) ? num1 : num2;

        System.out.println(min);
        System.out.println("++++++++++++++++++++++++++++++++");
        int hour=14;
        String daytime=(hour<12) ? "Good morning" : (hour>12 && hour<18) ? "Good Afternoon": "Good evening";

        System.out.println(daytime);

        int number=12000;
        boolean divisibleby3and5=(number%3==0 && number%5==0) ? true: false;
        System.out.println(divisibleby3and5);


        System.out.println("=====================================================================");









    }


}
