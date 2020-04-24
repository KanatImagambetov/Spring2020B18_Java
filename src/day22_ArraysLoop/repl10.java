package day22_ArraysLoop;

public class repl10 {
    public static void main(String[] args) {
        String str="abcXXXXabbbc";
        int count=0;
        for(int i=1; i<=str.length()-2;i++){
            if((str.charAt(i))==(str.charAt(i-1))&&(str.charAt(i))==(str.charAt(i+1))){
                count++;
            }
        }
        System.out.println(count);
    }
}
