package day23_methods;

public class MethodPractice {
    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        Hello();
        System.out.println("Hello Batch18");
        Hello();
        System.out.println("Hello Saim");

        evenNumbers();
        oddNumbers();

    }
    public static void Hello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hellow World");
        }
    }
    public static void evenNumbers(){
        for(int i=1;i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void oddNumbers(){
        for(int i=1;i<=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
