package day19_Arrays;

public class Unique {
    public static void main(String[] args) {
        String word="AABzzfsVFSvvcCC";
        String word1="";


        for(int j=0; j<=word.length()-1;j++){
            int count=0;
            for(int i=0; i<=word.length()-1; i++) {
                if ((word.charAt(i))==(word.charAt(j))) {
                    count++;
                }

            }
            if (count == 1) {
                word1+=word.charAt(j);
            }

        }

        System.out.println(word1);



        }


    }

