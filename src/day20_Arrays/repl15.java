package day20_Arrays;

public class repl15 {
    public static void main(String[] args) {
        String sentence="java, javascript and python";

        int java=0;
        int python=0;
        sentence=sentence.toLowerCase();

        for(int i=1;i<=10000; i++){
            if(sentence.contains("java")){
                sentence=sentence.replaceFirst("java","");
                java++;
            }
            if(sentence.contains("python")){
                sentence=sentence.replaceFirst("python","");
                python++;
            }
        }
        if(java==python){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
