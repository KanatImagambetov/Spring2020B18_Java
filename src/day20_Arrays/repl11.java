package day20_Arrays;

public class repl11 {
    public static void main(String[] args) {
        String word="catsdsdogadsascatsddog";
        int countOfCats = 0;
        int countOfDogs = 0;

        word=word.toLowerCase();
        for(int i=0; i<=100; i++) {
            if (word.contains("cat")) {
                word = word.replaceFirst("cat", "");
                countOfCats++;
            }
            if (word.contains("dog")) {
                word = word.replaceFirst("dog", "");
                countOfDogs++;
            }
        }
        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
