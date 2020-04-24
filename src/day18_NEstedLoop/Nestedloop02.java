package day18_NEstedLoop;

public class Nestedloop02 {
    public static void main(String[] args) {
        for (int j = 5; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===================================================");
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===================================================");
        for (char z = 'a'; z <= 'z'; z++) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

            for (char z = 'z'; z >= 'a'; z--) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}