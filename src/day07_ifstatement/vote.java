package day07_ifstatement;

public class vote {
    public static void main(String[] args) {
        int age=18;
        boolean citizen = true;
        boolean likeD=true;
        boolean elig=age==18 && citizen==true;
        //if(elig==true){
        if(elig) {
            System.out.println("eligble to vote");
        }
        //if(elig!=true){
        if(!elig) {
            System.out.println("not eligible to vote");

        }



    }



}
