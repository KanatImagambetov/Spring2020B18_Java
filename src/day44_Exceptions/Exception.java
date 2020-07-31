package day44_Exceptions;

public class Exception extends Throwable {
    public static void main(String[] args) {
        String str="Cybertek";

        try{
            System.out.println(str.charAt(100));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Catch");
            String discri=e.getMessage();
            System.out.println(discri);
        }
        System.out.println("=====================================");

        try{
            System.out.println(100/0);
        }catch (ArithmeticException e){
            System.out.println("Catch");
            String discri=e.getMessage();
            System.out.println(discri);
        }

        System.out.println("Completed");
    }
}
