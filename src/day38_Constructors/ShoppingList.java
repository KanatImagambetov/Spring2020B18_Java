package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1=new Item("Carrot", 1000,3);
 //       System.out.println(item1);
//        System.out.println(item1.quntity+": "+item1.calcCost());
 //       System.out.println("======================================");
        Item item2=new Item("Apple", 750,2);
        Item item3=new Item("Orange", 500,1);
        Item item4=new Item("Onion", 350,6);
        Item item5=new Item("Melon", 100,4);

        ArrayList<Item> itemlist=new ArrayList<>();
        itemlist.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        double totalCost=0;
        for(Item each:itemlist){
            totalCost+=each.calcCost();
        }
        System.out.println("Total cost "+totalCost);
        double totalCost1=0;
        for(int i=0; i<itemlist.size();i++){
            totalCost1+=itemlist.get(i).calcCost();
        }
        System.out.println("Total cost1 "+totalCost1);
    }
}
