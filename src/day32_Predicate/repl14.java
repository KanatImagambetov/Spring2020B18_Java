package day32_Predicate;

public class repl14 {
    public static void main(String[] args) {
        String a="Nurses run";
        boolean b=isPalindrome(a);
        System.out.println(b);
    }
    public static boolean isPalindrome(String check) {
        String check2=check.replace(" ","");
        String check1=check2.toLowerCase();
        String reverse = "";
        for(int i = check1.length() - 1; i >= 0; i--){
            reverse += check1.charAt(i);
        }
        boolean a=check1.equals(reverse);
        return a;
    }
}
