package day14_StringClass;
import java.util.Scanner;
/*
Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone

					DO NOT USE + OPERATOR
 */
public class combineTwoString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String f=input.next();
        System.out.println("Enter second word");
        String s=input.next();

        String fs=f.concat(" "+s).concat(" "+s).concat(" "+f);

        System.out.println(fs);
        System.out.println("=============================================");
/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.

			Input:
				apple
				banana
			Output:
				ppleanana
 */




    }



}
