package day10_Siwtch_Scanner;

public class switchstatement_practice3 {
    public static void main(String[] args) {
        char ch='A';
        String res="";

        switch(ch) {
            case 'A':
//                System.out.println("A");
                res += "A";
//                break;
            case 'B':
//                System.out.println("B");
                res += "B";
//                break;
            case 'C':
//                System.out.println("C");
                res += "C";
//                break;
            case 'D':
//                System.out.println("D");
                res += "D";
//                break;
            default:
//               System.out.println("Invalid");
                res += "Invalid";
//                break;
        }
        System.out.println(res);




    }
}
