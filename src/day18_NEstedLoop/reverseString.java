package day18_NEstedLoop;

public class reverseString {
    public static void main(String[] args) {
        String str="Kanat Imagambetov";

        String reverse="";
        int lastindex=str.length()-1;
        do{
            reverse+=str.charAt(lastindex);
            lastindex--;
        }while(lastindex>=0);
        System.out.println(reverse);

    }
}
