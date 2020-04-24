package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class foreachloop {
    public static void main(String[] args) {
        int num[]={1,2,3,4};

        for(int eachelement: num){
            System.out.print(eachelement);
        }
        System.out.println();
        String[] students={"Muhtar","Asiya","Kanat","Kaiarat"};

        for (String eachm: students){
            System.out.print(eachm+" ");
        }
        System.out.println();
        int num1[]={1,2,3,4,5,6,7,8,9,10};

        for(int each: num1){
            if(each<5){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();

        String sentence="I like Java";
        String[] sen=sentence.split(" ");
        for (String sen1: sen){
            System.out.print(sen1+" ");
        }
        System.out.println();
        String sen2="";
        for(int i=sen.length-1; i>=0;i--){
            sen2+=sen[i]+" ";

        }
        System.out.println(sen2);




    }
}
