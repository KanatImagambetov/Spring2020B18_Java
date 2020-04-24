package day22_ArraysLoop;

import java.util.Scanner;

public class repl14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String shoppingListReport = "";
//        String item = "";
//        String countinue = "";
//        double price1 = 0;
        int count1 = 1;
        double totalPrice = 0;

        for(int i=count1; i<=10; i++) {
            System.out.println("Enter item"+i+ " and its price:");
            String item1=scan.next();
            double price1=scan.nextDouble();
            shoppingListReport+=", Item"+i+": "+item1+" Price: "+price1;
            totalPrice+=price1;
            System.out.println("Add one more item?");
            String continue1=scan.next();
            if(continue1.equals("no")){
                break;
            }
        }
      System.out.println(shoppingListReport.replaceFirst(", ",""));
      System.out.println("Total price: "+totalPrice);
    }
}
