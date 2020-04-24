package day22_ArraysLoop;

public class repl08 {
    public static void main(String[] args) {
        int[] nums={5, 5, 9, 1, 5};

        String word="";
        int count=0;
        for(int i=0; i<=nums.length-2;i++){
            if(nums[i]==5&&nums[i+1]==5){
                word="true";
            }else{
                word="false";;
            }
            if(word=="true"){
                break;
            }
        }
        System.out.println(word);
    }
}
