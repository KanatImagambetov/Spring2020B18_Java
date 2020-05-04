package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {
        cat cat1=new cat();
        cat1.setCatInfo("Siemes","white","Boss",2);
        System.out.println(cat1);

        cat cat2=new cat();
        cat2.setCatInfo("Scotish","blue","Hulk",10);
        System.out.println(cat2);

        cat cat3=new cat();
        cat3.setCatInfo("Calico","grey","Storm",12);
        System.out.println(cat3);

        ArrayList<cat> catlist=new ArrayList<>();
        catlist.addAll(Arrays.asList(cat1,cat2,cat3));
        for(int i=0; i<catlist.size();i++){
            System.out.println(catlist.get(i));
        }
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        System.out.println("==========================");
        cat1.eat(" cat treats");
        cat2.eat(" meat");
        cat3.eat(" fish");
        System.out.println("===========================");
        cat1.drink(" coffee");
        cat2.drink(" milk");
        cat3.drink(" water");



    }
}
