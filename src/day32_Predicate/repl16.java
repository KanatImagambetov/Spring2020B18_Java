package day32_Predicate;

public class repl16 {
    public static void main(String[] args) {
        System.out.println(coverString("java methmeods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String a1="";
        if(main.contains(coverME)){
            a1+=main.replaceAll(coverME,"["+coverME+"]");
        }else{
            a1+="["+main+"]";
        }
        return a1;
    }
}
