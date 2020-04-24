package day24_Methods;

import java.util.Scanner;

public class birthyear {
    public static void Age(int birthyear) {
//        Scanner scan=new Scanner(System.in);
        int currentyear=2020;
        int age=currentyear-birthyear;
        if(birthyear<currentyear&&birthyear>1900) {
            System.out.println(age);
        }else{
            System.out.println("Invalid age");
        }
    }

    public static void main(String[] args) {
        int a=1800;

        Age(a);
        printHelloCybertek();
    }

    public static void printHello() {
        System.out.println("Hello");
    }
    public static void printCybertek() {
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek() {
        printHello();
        printCybertek();
    }

}
