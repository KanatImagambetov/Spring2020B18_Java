package day20_Arrays;
//import java.util.Scanner;
public class repl14 {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter word");
        String word="java";
        int count=0;
        for(int i=1; i<=1000;i++){
            if(word.contains("java")) {
                word = word.replaceFirst("java", "");
                count++;
            }
        }
        System.out.println(count);
    }
}
