package day15_loop;

public class loop2 {
    public static void main(String[] args) {
        String str = "Java";
//        String rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        int lastindex=str.length()-1;


        for(int i=lastindex; i>=0; i--){
            System.out.print(str.charAt(i));
        }



    }
}
