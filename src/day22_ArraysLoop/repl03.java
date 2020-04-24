package day22_ArraysLoop;

public class repl03 {
    public static void main(String[] args) {
        String[] words={"hello", "why", "by", "apple" , "note"};

        for(String each:words){
            System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));
        }
    }
}
