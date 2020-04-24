package day16_Forloop;

import java.util.Scanner;

public class repl2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        String split = input.next();

        System.out.println("Number of people:");
        int np = input.nextInt();

        System.out.println("Check amount:");
        double tp = input.nextDouble();

        System.out.println("Service Quality:");
        String sq = input.next();

        //   String res="";
        int num=0;

        if (split.contains("Yes")) {
            num = (sq.contains("Poor")) ? 5 : (sq.contains("Fair")) ? 10 : (sq.contains("Good")) ? 15 : (sq.contains("Great")) ? 20 : (sq.contains("Excellent")) ? 25 : 0 ;
        } else {

        }

        int num1=num;

        String people = "";
        if (split.equals("Yes")) {
            people = (np == 1) ? "&" : (np == 2) ? "&&" : (np == 3) ? "&&&" : (np == 4) ? "&&&&" : (np == 5) ? "&&&&&" : (np == 6) ? "&&&&&&" : (np == 7) ? "&&&&&&&" : (np == 8) ? "&&&&&&&&" : (np == 9) ? "&&&&&&&&&" : " ";
        } else {

        }


        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + (1 + num1 / 100) * tp);
        System.out.println("Total tip: " + num1 / 100 * tp);
        System.out.println("Total per person: " + (1 + num1 / 100) * tp / np);
        System.out.println("Tip per person: " + num1 / 100 * tp / np);



    }
}
