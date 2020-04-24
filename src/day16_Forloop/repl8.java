package day16_Forloop;

public class repl8 {
    public static void main(String[] args) {

        String word="dfd";
//        String word1 = "";

        if (word.startsWith("x") || word.startsWith("X")) {
            word = word.substring(0, 1).toLowerCase() + word.substring(1);
            word=word.replaceFirst("x","");
        }else{
            word=word;
        }

        if (word.endsWith("x") || word.endsWith("X")) {
            word = word.substring(0,word.length()-1)+word.substring(word.length()-1).toLowerCase();
            word=word.replace("x","");
        }else{
            word=word;
        }
        System.out.println(word);
    }
}