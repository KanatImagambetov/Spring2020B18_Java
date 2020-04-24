package day18_NEstedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=12, b=5;


        if(b==0){
            System.out.println("b cannot be zero");
            System.exit(0);
        }
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
        if(a==0) {
            System.out.println("The result is "+count);
//            System.out.println(a);
        }else{
            System.out.println("The result is "+count+" with a remainer of "+a);
        }




    }

}
