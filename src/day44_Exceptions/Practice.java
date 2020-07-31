package day44_Exceptions;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }


        System.out.println("Cybertek");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        System.out.println("Completed");
    }
}
