package day32_Predicate;

public class repl07 {
    public static void main(String[] args) {
        String[] f={"f","o","o"};
        String[] f1={" b","a","r"};
        String f2=combineRs(f,f1);
        System.out.println(f2);

    }

        public static String combineRs(String[] r1, String[] r2) {
            String a="";
            for(int i=0; i<=r1.length-1;i++){
                a+=r1[i];
            }
            String b="";
            for(int i=0; i<=r2.length-1;i++){
                b+=r2[i];
            }
            String c=a+""+b;
            return c;
        }
}
