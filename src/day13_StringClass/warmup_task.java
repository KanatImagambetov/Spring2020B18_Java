package day13_StringClass;
import java.util.Scanner;
/*
		2. write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

			MUST use Scanner and switch statement
 */
public class warmup_task {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter number 0-9");
        int a=input.nextInt();

        switch(a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 0:
                System.out.println("zero");
                break;
            default:
                System.out.println("invalid");
                break;






        }


    }



}
