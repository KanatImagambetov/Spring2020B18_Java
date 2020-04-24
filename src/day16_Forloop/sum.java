package day16_Forloop;

public class sum {
    public static void main(String[] args) {
        int sum=0;
        int sum1=0;
        for(int i=0; i<=555; i++){
            if(i%2!=0){
                sum+=i;
            }else{
                sum1+=i;

            }

        }
        System.out.println("sum of all even numbers: "+sum);
       System.out.println("sum of all odd numbers: "+sum1);



    }


}
