package day25_MethodsRecap;

public class Frequently {
    public static void main(String[] args) {
        String str1="javajavajavajavajavajavajavajava";
        String str2="java";

        int count=0;

        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");
        }
        System.out.println(count);

        String a="python python python python python python";
        String b="python";

        int num=frequency(a,b);
        System.out.println(num);

    }

    public static int frequency(String str1, String str2) {
        int count=0;

        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");
        }
       return count;
    }
}
