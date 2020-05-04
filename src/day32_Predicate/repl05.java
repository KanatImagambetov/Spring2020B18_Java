package day32_Predicate;

public class repl05 {
    public static void main(String[] args) {
        String b="aa2aa3";
        String a=extractNum(b);
        System.out.println(a);
    }
    public static String extractNum(String s) {
        String word=s;
        int num=s.length();
        String word1="";
        for(int i=0;i<=num-1; i++){
            if(word.charAt(i)>=48&&word.charAt(i)<=57){
                word1+=word.charAt(i);
            }
        }
        return word1;
    }
}