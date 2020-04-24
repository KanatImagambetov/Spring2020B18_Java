package day16_Forloop;

public class BreaksStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
                System.out.println("Hello world");
                //   break;


        }
        for(char i='a'; i<='z'; ++i){
            System.out.println(i);
            if(i=='d'){
                break;
            }
            System.out.println(i);
        }
    }
}
