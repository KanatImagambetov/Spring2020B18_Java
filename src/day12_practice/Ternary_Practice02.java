package day12_practice;

//import java.util.Scanner;

public class Ternary_Practice02 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);

  char ch1='A';
  String res=(ch1=='A') ? "A is selected": (ch1=='B') ? "B is selected" :
          (ch1=='C') ? "C is selected" : (ch1=='E') ? "E is selected" :
                  (ch1=='D') ? "D is selected" : "Invalid";
        System.out.println(res);


    }


}
