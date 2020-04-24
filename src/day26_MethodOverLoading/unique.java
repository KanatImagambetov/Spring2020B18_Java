package day26_MethodOverLoading;

public class unique {
    public static void main(String[] args) {
        String str="ABBC";
        String res="";
        for(int i=0; i<str.length();i++){
            int num=frequency(str,str.charAt(i));
            if(num==1){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);

        String str2="CYBERTEK";
        String res1=uniques(str2);
        System.out.println(res1);

    }

    public static String uniques(String str) {
        String res="";
        for(int i=0; i<str.length();i++){
            int num=frequency(str,str.charAt(i));
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
