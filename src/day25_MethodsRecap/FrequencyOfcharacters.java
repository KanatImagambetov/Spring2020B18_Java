package day25_MethodsRecap;
import Resources.Library;

public class FrequencyOfcharacters {
    public static void main(String[] args) {
        String str="AABBCC";
        String NonDup=Library.removeDubl(str);
        String res="";

    for(int i=0;i<NonDup.length();i++) {
      String ch = "" + NonDup.charAt(i);
      int num = Library.frequency(str, ch);
      res+=ch + num;
    }
        System.out.println(res);
    }

    public static String FrequencyOfCahrs(String str) {
        String NonDup=Library.removeDubl(str);
        String res="";
        for(int i=0;i<NonDup.length();i++) {
            String ch = "" + NonDup.charAt(i);
            int num = Library.frequency(str, ch);
            res+=ch + num;
        }
        return res;

    }
}
