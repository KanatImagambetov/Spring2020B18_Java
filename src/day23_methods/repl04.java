package day23_methods;

import java.util.Arrays;
import java.util.Scanner;

public class repl04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        //person("jon,doe,30");
        person(s) ;
        //person name: jon last name: doe age: 30
    }
    public static void person(String info){
        String[] info1=info.split(",");
        System.out.println("person name: "+info1[0]+" last name: "+info1[1]+" age: "+info1[2]);

    }//end person

}
