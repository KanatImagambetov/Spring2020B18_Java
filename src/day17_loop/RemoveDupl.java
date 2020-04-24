package day17_loop;

public class RemoveDupl {
    public static void main(String[] args) {
        String str="AAADDSDFDFD";

//        String noneDupl="";


        int i=0;
        while(str.contains("D")){
            i++;
            str=str.replaceFirst("D", "");
        }

        System.out.println(i);


    }
}
