package day20_Arrays;

import java.util.Scanner;

public class repl10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String shoppingListReport = "";
//        String item = "";
        String countinue = "";
//        double price = 0;
        int count = 1;
        double totalPrice = 0;
        //==============================================================================
        String res="";
        double totalpr=0;
        String res1="";
        String item = "Item1";
        System.out.println("Enter " + item + " and its price:");
        String prod = scan.next();
        double price = scan.nextDouble();
        res +=item + ": " + prod + " Price: " + price;
//=====================================================================================
        for(int i=2; i<=4; i++) {
            String item1 = "Item"+i;
            System.out.println("Enter " + item1 + " and its price:");
            String prod1 = scan.next();
            double price1 = scan.nextDouble();
            res1 +=", " + item1 + ": " + prod1 + " Price: " + price1;
            price+=price1;

            System.out.println("Add one more item?");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("yes")){

            }
            if(answer.equalsIgnoreCase("no")){
                break;
            }
            }
        System.out.println(res+res1);
        System.out.println("Total price: "+price);
    }
}
