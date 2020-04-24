package day09_Nested_Ternary;

public class ternary {
    public static void main(String[] args) {
        int num=100;
        String res="";

        if(num%2==0){
            res="even";
        }else{
            res="Odd";
        }
        System.out.println(res);

        String res2=(num%2==0)? "even" : "odd";
        System.out.println(res2);

        System.out.println("===============================================================");

        int num1=100;
        int num2=200;
        int max=0;

        if(num1>num2){
            max=num1;
        }else {
            max = num2;
        }

        int max2=(num1>num2) ? num1 : num2;

        System.out.println(max);
        System.out.println(max2);

        String str="";

        if(true){
            str="Hello";
        }else{
            str="Hola";
        }

        System.out.println(str);

        String str2=(true) ? "hello" : "hola";

        System.out.println(str2);








    }



}
