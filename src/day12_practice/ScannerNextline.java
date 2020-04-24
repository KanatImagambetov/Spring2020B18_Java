package day12_practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ScannerNextline {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your name: ");
        int full=input.nextInt(); // enter+enter+enter "Kanat"

        System.out.println(full);

        input.nextLine();

        System.out.println("Enter your full name: ");
        String name=input.nextLine();
        System.out.println("name "+ name);



    }




}
