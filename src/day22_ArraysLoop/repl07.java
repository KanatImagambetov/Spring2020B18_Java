package day22_ArraysLoop;

public class repl07 {
    public static void main(String[] args) {
        String[] arr={"apple","bananas","orange","limon","holly"};

        for(String each:arr){
            System.out.println(each.substring(0,3));
        }
    }
}
