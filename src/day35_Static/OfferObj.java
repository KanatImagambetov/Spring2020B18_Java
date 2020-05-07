package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObj {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("Houston","BankOfAmerica",250000,true);
//        System.out.println(offer1);
        System.out.println("==========================================");
        Offer offer2=new Offer();
        offer2.setInfo("Austin","Google",250000,false);
//        System.out.println(offer2);
        System.out.println("==========================================");
        Offer offer3=new Offer();
        offer3.setInfo("Houston","Amazon",265000,true);
//        System.out.println(offer3);
        System.out.println("==========================================");
        Offer offer4=new Offer();
        offer4.setInfo("New Orleans","Apple",365000,true);
//        System.out.println(offer4);

        Offer[] offers={offer1,offer2,offer3,offer4};
        String myLocation="Houston";

        ArrayList<Offer> accept=new ArrayList<>(Arrays.asList(offers));
        accept.removeIf(p->p.salary<200000||p.isFullTime==false||!p.location.equals(myLocation));

        for(Offer each:accept){
            System.out.println(each);
            System.out.println("===============================");
        }

    }
}
