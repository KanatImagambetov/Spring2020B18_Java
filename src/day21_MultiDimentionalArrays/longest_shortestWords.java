package day21_MultiDimentionalArrays;


import java.util.Arrays;

public class longest_shortestWords {
    public static void main(String[] args) {
        String[] arr={"Kanat", "Ost", "Mukhtar", "Baurzhan"};

        Arrays.sort(arr);

        System.out.println("Shortest "+arr[arr.length-1]);
        System.out.println("Longest "+arr[0]);

        int max=arr[0].length();
        int min=arr[0].length();
        String longestword="";
        String shortestword="";
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i].length()>max){
                max=arr[i].length();
                longestword=arr[i];
            }
            if(arr[i].length()<min){
                min=arr[i].length();
                shortestword=arr[i];
            }
        }
        System.out.println("Shortest "+shortestword);
        System.out.println("Longest "+longestword);
    }
}
