package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObj {
    public static void main(String[] args) {
        warmup[] carpets={new warmup(), new warmup(), new warmup(), new warmup(), new warmup()};
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35,45,35,true);

        System.out.println(carpets[0]);
        System.out.println("============================================");
        System.out.println(carpets[1]);
        System.out.println("============================================");
        System.out.println(carpets[2]);
        System.out.println("============================================");
        System.out.println(carpets[3]);
        System.out.println("============================================");
        System.out.println(carpets[4]);
        ArrayList<warmup> persianCarpets=new ArrayList<>();

        for(warmup each:carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }
        }
        System.out.println("there are "+persianCarpets.size()+" persian carpets");

        System.out.println(persianCarpets.get(0).calcCost());
        System.out.println(persianCarpets.get(1).calcCost());


        ArrayList<warmup> regularCarpets=new ArrayList<>(Arrays.asList(carpets));
//        regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf(p->p.isPersian==true);

        System.out.println("There are "+regularCarpets.size()+" regular carpets");
//        System.out.println(regularCarpets.get(0).calcCost());

        for(int i=0; i<regularCarpets.size();i++){
            System.out.println(regularCarpets.get(i).calcCost());
        }

    }
}