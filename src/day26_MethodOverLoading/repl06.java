package day26_MethodOverLoading;

public class repl06 {

    public static void printUniqueNumbers(String[] nums){
        //WRITE YOUR CODE HERE
        for(int i=0;i<=nums.length-1; i++){
            int count=0;
            for(String each:nums){
                if(nums[i].equals(each)){
                    count++;
                }
            }
            if(count==1) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] num={"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueNumbers(num);
    }
}
