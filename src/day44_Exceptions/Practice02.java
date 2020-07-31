package day44_Exceptions;

public class Practice02 {
    public static void main(String[] args) {
        System.out.println("Java");
        waits(5);
        System.out.println("Cybertek");
    }

    public static void waits(int args) {
        try {
            Thread.sleep(args*1000);
        } catch (InterruptedException e) {
        }
    }
}
