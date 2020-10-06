package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LC283 {
    /*
    283. 移动零
     */
    class Solution {
        public void moveZeroes(int[] nums) {
            int len=nums.length;
            if (len < 1) return;
            int zeroc=0;
            for (int num : nums) {
                if (num==0) zeroc++;
            }
            int i=0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] != 0) {
                    nums[i++]=nums[k];
                }
            }
            Arrays.fill(nums,len-zeroc,len,0);
        }
    }
}
