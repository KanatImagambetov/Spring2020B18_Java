package day19_Arrays;

public class Unique01{
    public static void main(String[] args) {

        String word="AFDFGFDDASSFDGDFD";
        String word1="";
        for(int j=0; j<=word.length()-1; j++) {
            //==================================================
            if(!word1.contains(""+word.charAt(j))){
                word1+=word.charAt(j);
            }

        }
        System.out.println(word1);

    }
}