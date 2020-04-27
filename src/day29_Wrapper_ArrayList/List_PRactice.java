package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_PRactice {
    public static void main(String[] args) {
        ArrayList<String> shoppingList=new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        shoppingList.add("Toilet Paper");
        System.out.println(shoppingList);
 //       System.out.println(shoppingList.get(0));
 //       System.out.println(shoppingList.get(1));
        for(String each:shoppingList){
            System.out.println(each);
        }

        int a=shoppingList.size();
        System.out.println(a);
        System.out.println(shoppingList.get(a-1));

    }
}
