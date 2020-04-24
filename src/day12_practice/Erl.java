package day12_practice;
import java.util.Scanner;
public class Erl {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan=new Scanner(System.in);

            System.out.println();

            System.out.println("Enter Item1, count and its price: ");
            String item1=scan.next();
            int count1=scan.nextInt();
            double price1=scan.nextDouble();

            String item2=scan.next();
            int count2=scan.nextInt();
            double price2=scan.nextDouble();

            String item3=scan.next();
            int count3=scan.nextInt();
            double price3=scan.nextDouble();

            if(count1!=0){
                System.out.println("Total price: "+count1*price1);
            }else{

            }

            if(count2!=0){
                System.out.println("Total price: "+count2*price2);
            }else{

            }

            if(count3!=0){
                System.out.println("Total price: "+count3*price3);
            }else{

            }

        }
    }
