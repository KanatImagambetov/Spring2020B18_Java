package day16_Forloop;

import java.util.Scanner;

public class road {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter start:");
        String num1=scan.next();
        System.out.println("Enter end:");
        String num2=scan.next();
        String res="";

        if(num1.equals("A")&&num2.equals("D")){
            res="right > down > left: D found";
        }else if(num1.equals("A")&&num2.equals("C")){
            res="right > down: C found";
        }else if(num1.equals("A")&&num2.equals("B")){
            res="right: B found";
        }else if(num1.equals("B")&&num2.equals("A")){
            res="down > left > up: A found";
        }else if(num1.equals("B")&&num2.equals("D")){
            res="down > left: D found";
        }else if(num1.equals("B")&&num2.equals("C")){
            res="down: C found";
        }else if(num1.equals("C")&&num2.equals("B")){
            res="left > up > right: B found";
        }else if(num1.equals("C")&&num2.equals("A")){
            res="left > up: A found";
        }else if(num1.equals("C")&&num2.equals("D")){
            res="left: D found";
        }else if(num1.equals("D")&&num2.equals("C")){
            res="up > right > down: C found";
        }else if(num1.equals("D")&&num2.equals("B")){
            res="up > right: B found";
        }else if(num1.equals("D")&&num2.equals("C")){
            res="up: A found";
        }else if (num1.equals(num2)||num2.equals(num1)){
            res=num1+" found";

        }
        System.out.println(res);

    }
}
