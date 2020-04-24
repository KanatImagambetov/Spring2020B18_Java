package day15_loop;
import java.util.Scanner;
public class warmup01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int mid = word.length();

        String res = "";

        //kanat
        //01234
        if (mid > 1) {
            if (mid>2) {
                if (mid % 2 == 0) {
                    res = word.substring(mid / 2 - 1, mid / 2 + 1);
                } else {
                    res = word.substring(mid / 2, mid / 2 + 1);
                }
            } else {
                res = word + word;
            }
/*
  if (mid == 2) {
                if (mid % 2 == 0) {
                    res = word.substring(mid / 2 - 1, mid / 2 + 1);
                } else {
                    res = word.substring(mid / 2, mid / 2 + 1);
                }
            } else {
                res = word + word;
 */
        } else {
            res = word + word + word;
        }

        System.out.println(res);
    }

}





//        if(mid){
//        }else{
//         }
