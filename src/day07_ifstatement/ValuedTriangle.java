package day07_ifstatement;

public class ValuedTriangle {
    public static void main(String[] args) {
        double angl1=30.0;
        short angl2=90;
        short angl3=60;
        double sumofangl= angl1+angl2+angl3;

    //    boolean validtraingle=sumofangl==180;
       // if(validtraingle) {
        if(sumofangl==180){
            System.out.println("the shape is a triangle");
        }

        //if(!validtraingle) {
        if(sumofangl!=180){
            System.out.println("the shape is not a triangle");
        }



    }



}
