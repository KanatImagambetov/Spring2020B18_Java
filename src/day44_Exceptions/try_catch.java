package day44_Exceptions;

public class try_catch {
    public static void main(String[] args) {
        System.out.println("Hello");

        try{
            Thread.sleep(3000);
            System.out.println("Try block");
        }catch (Exception e){
            System.out.println("Catch Block");
        }
        System.out.println("World");
    }
}
