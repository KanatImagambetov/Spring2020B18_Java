package day26_MethodOverLoading;

public class repl03 {
    public static String uniqueChars(String str) {
        String str1="";

        for(int i=0;i<str.length();i++){
            if(!str1.contains(""+str.charAt(i))){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        System.out.println( uniqueChars("BugBusters") ) ;
    }
}
