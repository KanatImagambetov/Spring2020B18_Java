package day20_Arrays;

import java.util.Arrays;

public class repl3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,4, 4, 3, 5};

        for (int i = 0; i <= nums.length - 1; i++) {

            int res = nums[i] - nums[i + 1];
            if (res == 0) {
                System.out.println(true);
                break;
                //       break;
            }
        }

    }


}