package day12_practice;

import java.util.Scanner;

public class sumoffivenumbers {
    public static void main(String[] args) {
        // Enter your code here
        Scanner input = new Scanner(System.in);

//    input.nextLine();
        System.out.println("Welcome to the Grader! \nPlease enter subject name number 1 and score for this subject");
        String subject1 = input.next();
        double grade1 = input.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = input.next();
        double grade2 = input.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = input.next();
        double grade3 = input.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = input.next();
        double grade4 = input.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = input.next();
        double grade5 = input.nextDouble();
        System.out.println("Please enter subject name number 6 and score for this subject");
        String subject6 = input.next();
        double grade6 = input.nextDouble();
        double agerage = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6) / 6;
        System.out.println("Summary: " + subject1 + " - " + grade1 + ", " + subject2 + " - " + grade2 + ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4 + ", " + subject5 + " - " + grade5 + ", " + subject6 + " - " + grade6);
        System.out.println("Your average score is: " + agerage);
        System.out.println("Thank you for using Grader!" + "\nGoodbye!");
        input.close();

    }
}