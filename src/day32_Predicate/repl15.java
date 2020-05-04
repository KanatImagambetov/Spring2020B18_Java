package day32_Predicate;

public class repl15 {
    public static boolean isAnagram(String word1, String word2) {
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        String word3=" ";

        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                if(word1.charAt(i)==word2.charAt(j)){
                    word1=word1.replace(word1.charAt(i),word3.charAt(0));
                    word2=word2.replace(word2.charAt(j),word3.charAt(0));
                }
            }
        }
        boolean a=word1.equals(word2);
        return a;
    }
}
