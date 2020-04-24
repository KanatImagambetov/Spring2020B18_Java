package day17_loop;

public class loop_practice_task {
    public static void main(String[] args) {
        String str="Java";
        String reverseStr="";

        int i=str.length()-1;
/*
        for(int k=i; k==0; --i){
            reverseStr+=str.charAt(i);

 */


        while(i>=0){
            reverseStr+=str.charAt(i);
            i--;

        }


        System.out.println(reverseStr);

    }

}
