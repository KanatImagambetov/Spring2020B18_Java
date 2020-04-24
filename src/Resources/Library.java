package Resources;

import java.util.Arrays;
public class Library {
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
    public static int[] sortDesend(int[] arrays) {
        Arrays.sort(arrays);
        int[] reverArr=new int[arrays.length];
        int i=arrays.length-1;
        for(int j=0;j<=arrays.length-1;j++) {
            reverArr[j]= arrays[i];
            i--;
        }
        return reverArr;
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
    public static int frequency(String str1, String str2) {
        int count=0;

        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");
        }
        return count;
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
    public static String uniques(String str) {

        String res="";
        for(int i=0; i<str.length();i++){
            int num=frequency(str, str.charAt(i));
            if(num==1){
                res+=str.charAt(i);
            }
        }
        return res;
    }
    public static int frequency(String str, char ch) {
        char[] arr=str.toCharArray();
        int count=0;
        for(int each: arr){
            if(each==ch){
                count++;
            }
        }
        return count;
    }
}
/*
public class Library {
    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }
    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
        return  Reverse;
    }
}
 */