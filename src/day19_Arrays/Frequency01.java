package day19_Arrays;

public class Frequency01 {
    public static void main(String[] args){
        String word="AFDFGFDDASSFDGDFD";
        String nodupl="";
        String res="";

        for(int i=0; i<=word.length()-1; i++){
            if(!nodupl.contains(""+word.charAt(i))){
                nodupl+=word.charAt(i);
            }
        }
        System.out.println(nodupl);

        for(int k=0; k<=nodupl.length()-1; k++) {
            char ch=nodupl.charAt(k);
            int count = 0;
            for (int j = 0; j <= word.length() - 1; j++) {
                if (word.charAt(j) == nodupl.charAt(k)) {
                    count++;
                }
            }
            res+=""+nodupl.charAt(k)+count;
        }
        System.out.println(res);


    }

}
