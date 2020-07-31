package day44_Exceptions;

public class FinalBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Try here");
            System.out.println(9/0);
            System.out.println("Try");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }finally {
            System.out.println("Finally");
        }


    }
}
