package day16_Forloop;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=inp.nextInt();
        int sum=0;
        int sum1=0;

        for(int i=0; i<=num; i++){
            if(i%2==0){
                sum+=i;
            }else{
                sum1+=i;
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum+sum1);

    }
}
