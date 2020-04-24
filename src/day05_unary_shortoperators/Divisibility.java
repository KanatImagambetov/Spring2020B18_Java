package day05_unary_shortoperators;

public class Divisibility {
    public static void main(String[] args) {
        int number=65;

        boolean divisi2=number%2==0;
        boolean divisi3=number%3==0;
        boolean divisi5=number%5==0;

//        System.out.println(number +" is divisible 2: " + divisi2);
//        System.out.println(number +" is divisible 3: " + divisi3);
//        System.out.println(number +" is divisible 5: " + divisi5);
        String result1=number +" is divisible 2: " + divisi2;
        String result2=number +" is divisible 3: " + divisi3;
        String result3=number +" is divisible 5: " + divisi5;
        String finalre= result1+ "\n"+result2+"\n"+result3;
/*
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
*/
     // System.out.println(result1+ "\n"+result2+"\n"+result3);
        System.out.println(finalre);




    }




}
