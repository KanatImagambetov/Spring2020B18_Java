package day18_NEstedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int z=0; z<10;z++){
            for(int i=0; i<10; i++){
                System.out.print(i+" ");
            }
           System.out.println();
        }
        System.out.println("=============================================");

        for (int z=0; z<7;z++){
            for(int i=0; i<7; i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
        for (int z=0; z<7;z++) {
            int a = 1;
            while (a <= 7) {
                System.out.print("* ");
                a++;
            }
            System.out.println();
        }




    }

}
