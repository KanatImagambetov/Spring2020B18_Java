package day20_Arrays;

public class repl16 {
    public static void main(String[] args) {
        String str="addabreadbreadkanatbreadasa";
        int count=0;
        String str1=str;

        for(int i=1; i<=1000;i++){
            if(str1.contains("bread")){
                str1=str1.replaceFirst("bread","");
                count++;
            }
        }
        if(count>=2){
            int first=str.indexOf("bread");
            int second=str.lastIndexOf("bread");
            System.out.println(str.substring(first+5,second));
        }else if(count<=1){
            System.out.println("nothing");
        }
    }
}
