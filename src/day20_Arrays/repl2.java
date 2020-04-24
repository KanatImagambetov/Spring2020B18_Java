package day20_Arrays;

public class repl2 {
    public static void main(String[] args) {
        String[] words = {"apple", "hello", "orange"};
        for(int i=0; i<=words.length-1; i++){
            String last=words[i].substring(words[i].length()-1);
            System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
        }
    }
}
