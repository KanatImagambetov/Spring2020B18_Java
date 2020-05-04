package day32_Predicate;

public class repl {
    public static void main(String[] args) {
        boolean a=appearsTwice("laptop","lapto, laptop reresds");
        System.out.println(a);
    }
        public static boolean appearsTwice(String target, String sentence) {
            int word1=sentence.length();
            int count=0;
            for(int i=0; i<word1; i++){
                if (sentence.contains(target)) {
                    sentence=sentence.replaceFirst(target, "");
                    count++;
                }
            }
            boolean tr=count==2;

            return tr;
        }
    }