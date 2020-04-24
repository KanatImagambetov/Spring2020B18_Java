package day24_Methods;

public class StringReverse {
    public static void main(String[] args) {

        reverse("Kabat");
        reverse("Cybertek");

        String res=reverse1("Cybertek");
        System.out.println(res);

    }
    public static void reverse(String word) {
        String reverse="";
        for(int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);
    }
    public static String reverse1(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}
