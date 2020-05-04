package day32_Predicate;

public class repl04 {
    public static void main(String[] args) {
        String str="string";

        int num=str.length();
        String str1=str.toLowerCase().charAt(0)+"";

        for(int i=1; i<=num-1; i++){
            if(i%2==0){
                str1+=str.toLowerCase().charAt(i);
            }else{
                str1+=str.toUpperCase().charAt(i);
            }
        }
        System.out.println(str1);
    }
}
