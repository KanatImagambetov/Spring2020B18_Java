package day12_practice;

import java.util.Scanner;

public class switch_praxtice01 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("your code: ");
        int a=input.nextInt();

        String b="";

        switch(a){
            case 1:
                b="ok";
                break;
            case 2:
                b="no";
                break;
            default:
                b="invalid";
                break;
        }
        System.out.println(b);

    }


}
