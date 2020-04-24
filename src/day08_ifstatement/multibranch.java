package day08_ifstatement;

public class multibranch {
    public static void main(String[] args) {
        int a=100;
        boolean zero=a==0;
        boolean neg=a<0;
        boolean pos=a>0;

        if(zero){
            System.out.println("zero");
        }
        if(neg){
            System.out.println("negative");
        }
        if(pos){
            System.out.println("positive");
        }
int b=-100;
        if(b==0){
            System.out.println("zero");
        }else if(b>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

    }




}
