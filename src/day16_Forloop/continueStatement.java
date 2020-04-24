package day16_Forloop;

public class continueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.print(i);
        }
        System.out.println("\n======================================");
        for(int z=0; z<=20; z++){
            if(z%2!=0){
                continue;
            }
            System.out.print(z+" ");
        }



    }

}
