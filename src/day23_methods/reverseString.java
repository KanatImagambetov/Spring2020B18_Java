package day23_methods;

public class reverseString {
    //create a function that can reverse any string
    //Cybertek==>ketrebyC
    public static void main(String[] args) {
        String name1="Kanat";
        ReverseString(name1);
        System.out.println("Hello");
        String name2="Cybertek School";
        ReverseString(name2);


    }
    public static void ReverseString(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

