package day12_practice;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter code: ");
        int code=scan.nextInt();

        String res=(code==200) ? "Ok" : (code==201) ? "Created" : (code==202) ? "Accepted" : "Invalid";

        System.out.println(res);








    }


}
