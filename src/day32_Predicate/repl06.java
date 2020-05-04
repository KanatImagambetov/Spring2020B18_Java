package day32_Predicate;

public class repl06 {
    public static void main(String[] args) {
        String v="lione error line";
        boolean a=isError(v);
        System.out.println(a);

    }

    public static boolean isError(String line){
        boolean a=line.startsWith("error");
        return a;
    }
}
