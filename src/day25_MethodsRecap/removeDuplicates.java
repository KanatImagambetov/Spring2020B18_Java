package day25_MethodsRecap;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="ADFGFDSDAASSSDDDFDDDSASS";
        String r=removeDubl(str);
        System.out.println(r);
    }
    public static String removeDubl(String dublicates) {
        String res="";

        for(int i=0;i<=dublicates.length()-1;i++){
            char ch=dublicates.charAt(i);
            if(!res.contains(""+ch)){
                res+=ch;
            }
        }
          return res;
     }
}
