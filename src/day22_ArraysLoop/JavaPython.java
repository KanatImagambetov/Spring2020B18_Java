package day22_ArraysLoop;

public class JavaPython {
    public static void main(String[] args) {
        String sentence="I like java java and python";
        int conJ=0;
        int conP=0;

        String[] words=sentence.split(" ");
        for(String each:words){
            if (each.contains("java")) {
               conJ++;
            }
        }
        System.out.println(conJ);
        for(String each:words){
            if (each.contains("python")) {
                conP++;
            }
        }
        System.out.println(conP);
        if(conJ==conP){
            System.out.println("true");;
        }else if(conJ!=conP){
            System.out.println(false);
        }
    }
}
