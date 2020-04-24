package day16_Forloop;

public class Alphabite {
    public static void main(String[] args) {
        String up="";
        String lo="";

        for(char ch='A'; ch<='Z'; ch++){
            up+=ch;
        }

//        System.out.println(up);

        for(char ch='a'; ch<='z'; ch++){
            lo+=ch;
        }
//        System.out.println(lo);

        String res="";
        System.out.println();

        int a=97;
        int A=65;

        for(int i=0; i<26; i++){
            char ch=(char)(A+i);
            char ch1=(char)(a+i);
            System.out.print(ch+""+ch1+" ");
        }

        for(int i=0; i<=up.length()-1; i++){
            res+=up.charAt(i)+""+lo.charAt(i)+" ";

        }
        System.out.println();
        System.out.println(res);

    }
}
