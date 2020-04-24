package day11_Scanner;

public class assignment {
    public static void main(String[] args) {

        int score=0;

        if(score==0) {
            score+=50;
        }
        if(score!=0){
            score+=100;
        }
        System.out.println(score);

        char gr='A';

        boolean pa=gr=='C' || gr=='B';
        boolean pa2=gr=='A' || gr=='D';

        if(pa||pa2){
            System.out.println("as");
        }else{
            System.out.println("ds");
        }

        boolean A=true, b=!false;

        if(b){
            System.out.println("b");
        }else if(A){
            System.out.println("a");
        }else{
            System.out.println("C");
        }

        boolean v=true, s=!v;

        if(v){
            if(s){
                System.out.println("Monday");
            }else{
                System.out.println("tuesday");
            }
        }else{
            if(v){
                System.out.println("Thursday");
            }else{
                System.out.println("Friday");
            }
        }





    }



}
