package day18_NEstedLoop;

public class DoWhilePractice {
    public static void main(String[] args) {
        int num=0;
        do{
            if(num%2==0){
                System.out.print(num+" ");
            }
            num++;
        }while(num<=100);
        System.out.println("=======================================");

        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while (i<=5);

        System.out.println("\n========================================");
        int z=1;
        do{
            System.out.print(z+" ");
            if(z==3){
                break;
            }
            z++;
        }while(z<=5);

        System.out.println("\n======================================");
        int y=1;

        do{
            if(y==3){
                y++;
                continue;
            }
            System.out.print(y+" ");
            y++;
        }while(y<=5);

        System.out.println("\n==========================================");

        int t=1;
        do{
            if(t%2!=0){
                t++;
                continue;
            }
            System.out.print(t+" ");
            t++;
        }while(t<=100);




    }
}
