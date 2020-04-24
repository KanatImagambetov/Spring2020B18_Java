package day18_NEstedLoop;

public class revverse {
    public static void main(String[] args) {
        String word="Kanat Imagambetov";
        int num=word.length()-1;
        String word1="";

        for(int i=num; i>=0; i--){
//            word1+=word.charAt(i);
//          word1=word1+word.charAt(i);
            word1=word1+word.substring(i,i+1);
        }
//        System.out.println(word1);

        if(!word.isEmpty()){
            if(word1.equalsIgnoreCase(word)){
                System.out.println(word+" "+word1+" is paleondram");
            }else{
                System.out.println(word+" "+word1+" is not paleondram");
            }
        }else{
            System.out.println("it is empty");
        }



    }
}
